/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

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
