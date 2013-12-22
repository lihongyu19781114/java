package javapuzzlers.BigDelight;

public class BigDelightFixed {
	// To summarize: Avoid mixed-type comparisons, because they are inherently confusing.
	// To help achieve this goal, use declared constants in place of "magic numbers."
	private static final byte TARGET =(byte)0x90;
	public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == TARGET)
                System.out.print("Joy!");
        }
	}

}
