/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Pair;

import java.util.Arrays;
import java.util.List;

// The raw type List is not the same as the parameterized type List<Object>.
// avoid writing raw types in code intended for release 5.0 or later.

public class PairFixed<T> {
	private final T first;
	private final T second;

	public PairFixed(T first, T second) {
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
		//        Pair p = new Pair<Object>(23, "skidoo");
		Pair<Object> p = new Pair<Object>(23, "skidoo"); // Good
		System.out.println(p.first() + " " + p.second());
		for (String s : p.stringList())
			System.out.print(s + " ");
		//        // Don't do this; it doesn't really fix the problem!
		//        for (Object s : p.stringList()) // Bad
		//        	System.out.print(s + " ");
	}
}
