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
