package javapuzzlers.Mod;

public class ModFixed {
	//  Math.abs is not guaranteed to return a nonnegative result.
	public static void main(String[] args) {
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];

		// Iterate over all ints (Idiom from Puzzle 25)
		int i = Integer.MIN_VALUE;
		do {
			histogram[/*Math.abs(i) % MODULUS*/mod(i, MODULUS)]++;
		} while (i++ != Integer.MAX_VALUE);

		for (int j = 0; j < MODULUS; j++)
			System.out.println(histogram[j] + " ");
	}

	private static int mod(int i, int modulus) {
	    int result = i % modulus;
	    return result < 0 ? result + modulus : result;
	}
}
