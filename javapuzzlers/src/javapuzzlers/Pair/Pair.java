/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Pair;
import java.util.*;

public class Pair<T> {
    private final T first;
    private final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T first() {
        return first;
    }
    public T second() {
        return second;
    }
    public List<String> stringList() {
        return Arrays.asList(String.valueOf(first),
                             String.valueOf(second));
    }

    public static void main(String[] args) {
        Pair p = new Pair<Object>(23, "skidoo");
        System.out.println(p.first() + " " + p.second());
//        for (String s : p.stringList())
//            System.out.print(s + " ");
    }
}
