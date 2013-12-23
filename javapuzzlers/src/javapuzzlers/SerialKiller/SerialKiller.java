/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.SerialKiller;
import java.util.*;
import java.io.*;

public class SerialKiller {
    public static void main(String[] args) {
        Sub sub = new Sub(666);
        sub.checkInvariant();

        Sub copy = (Sub) deepCopy(sub);
        copy.checkInvariant();
    }

    // Copies its argument via serialization (See Puzzle 80)
    static public Object deepCopy(Object obj) {
        try {
            ByteArrayOutputStream bos =
                new ByteArrayOutputStream();
            new ObjectOutputStream(bos).writeObject(obj);
            ByteArrayInputStream bin =
                new ByteArrayInputStream(bos.toByteArray());
            return new ObjectInputStream(bin).readObject();
        } catch(Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}

class Super implements Serializable {
    final Set<Super> set = new HashSet<Super>();
}

final class Sub extends Super {
    private int id;
    public Sub(int id) {
        this.id = id;
        set.add(this); // Establish invariant
    }

    public void checkInvariant() {
        if (!set.contains(this))
            throw new AssertionError("invariant violated");
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object o) {
        return (o instanceof Sub) && (id == ((Sub)o).id);
    }
}
