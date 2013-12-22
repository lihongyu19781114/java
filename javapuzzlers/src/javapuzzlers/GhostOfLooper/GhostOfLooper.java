package javapuzzlers.GhostOfLooper;
public class GhostOfLooper {
	// Narrowing primitive conversions can lose information about the magnitude or precision of numeric values.
	// do not use compound assignment operators on short, byte, or char variables.
    public static void main(String[] args) {
        // Place your declaration for i here
    	long i = -1; // -1L has all 64 bits set

        while (i != 0)
            i >>>= 1;
    }
}
