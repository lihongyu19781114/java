/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Name2;

import java.util.*;

public class Name {
    private String first, last;

    public Name(String first, String last) {
        this.first = first; this.last = last;
    }

    public boolean equals(Name n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Donald", "Duck"));
        System.out.println(
            s.contains(new Name("Donald", "Duck")));
    }
}
