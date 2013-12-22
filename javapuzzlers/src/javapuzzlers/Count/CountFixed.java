package javapuzzlers.Count;

public class CountFixed {
	// Do not use floating-point loop indices
	// You may lose precision when converting an int or long to a float or a long to a double
	// When you use floating-point, use double rather than float
	public static void main(String[] args) {
		final int START = 2000000000;
		int count = 0;
		for (int f = START; f < START + 50; f++)
			count++;
		System.out.println(count);
	}
}
