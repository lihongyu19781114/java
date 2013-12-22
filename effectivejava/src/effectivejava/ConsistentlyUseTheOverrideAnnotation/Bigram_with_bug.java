/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.ConsistentlyUseTheOverrideAnnotation;

import java.util.*;

//Can you spot the bug?
public final class Bigram_with_bug {
	private final char first;
	private final char second;
	public Bigram_with_bug(char first, char second) {
		this.first = first;
		this.second = second;
	}
	public boolean equals(Bigram_with_bug b) {
		return b.first == first && b.second == second;
	}
	public int hashCode() {
		return 31 * first + second;
	}
	public static void main(String[] args) {
		Set<Bigram_with_bug> s = new HashSet<Bigram_with_bug>();
		for (int i = 0; i < 10; i++)
			for (char ch = 'a'; ch <= 'z'; ch++)
				s.add(new Bigram_with_bug(ch, ch));
		System.out.println(s.size());
	}
}
