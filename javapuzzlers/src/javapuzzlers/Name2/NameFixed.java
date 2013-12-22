package javapuzzlers.Name2;
import java.util.*;

// Overloadings represent opportunities for error and confusion [EJ Item 26].
// To avoid unintentional overloading,
// mechanically copy the declaration of each superclass method that you want to override

public class NameFixed {
    private String first, last;

    public NameFixed(String first, String last) {
        this.first = first; this.last = last;
    }

//    @Override public boolean equals(Name n) {
//        return n.first.equals(first) && n.last.equals(last);
//    }

    @Override public boolean equals(Object o) {
        return o instanceof NameFixed && equals((NameFixed) o);
    }

    @Override public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<NameFixed> s = new HashSet<NameFixed>();
        s.add(new NameFixed("Donald", "Duck"));
        System.out.println(
            s.contains(new NameFixed("Donald", "Duck")));
    }
}
