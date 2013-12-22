package javapuzzlers.Name1;

import java.util.HashSet;
import java.util.Set;

//you must override hashCode whenever you override equals [EJ Item 8].

public class NameFixed {
	private String first, last;

	public NameFixed(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o) {
		if (!(o instanceof NameFixed))
			return false;
		NameFixed n = (NameFixed)o;
		return n.first.equals(first) && n.last.equals(last);
	}

	public int hashCode() {

		return 37 * first.hashCode() + last.hashCode();

	}


	public static void main(String[] args) {
		Set<NameFixed> s = new HashSet<NameFixed>();
		s.add(new NameFixed("Mickey", "Mouse"));
		System.out.println(
				s.contains(new NameFixed("Mickey", "Mouse")));
	}
}