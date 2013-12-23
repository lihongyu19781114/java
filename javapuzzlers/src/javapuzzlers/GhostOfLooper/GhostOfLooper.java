/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

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
