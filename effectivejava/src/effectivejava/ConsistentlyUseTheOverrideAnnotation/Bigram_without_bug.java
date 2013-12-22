/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.ConsistentlyUseTheOverrideAnnotation;

import java.util.HashSet;
import java.util.Set;

public final class Bigram_without_bug {
	private final char first;
	private final char second;
	public Bigram_without_bug(char first, char second) {
		this.first = first;
		this.second = second;
	}
//	// method does not override or implement a method from a supertype
//	@Override public boolean equals(Bigram_without_bug b) {
//		return b.first == first && b.second == second;
//	}
	@Override public boolean equals(Object o) {
		if (!(o instanceof Bigram_without_bug))
			return false;
		Bigram_without_bug b = (Bigram_without_bug) o;
		return b.first == first && b.second == second;
	}
	public int hashCode() {
		return 31 * first + second;
	}
	public static void main(String[] args) {
		Set<Bigram_without_bug> s = new HashSet<Bigram_without_bug>();
		for (int i = 0; i < 10; i++)
			for (char ch = 'a'; ch <= 'z'; ch++)
				s.add(new Bigram_without_bug(ch, ch));
		System.out.println(s.size());
	}
}
