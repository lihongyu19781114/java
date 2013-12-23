/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Shifty;

public class ShiftyFixed {
	// shift operators use only the five low-order bits of their right operand as the shift distance
	// Shift distances should, if possible, be constants.
	public static void main(String[] args) {
        int i = 0;
        for (int val = -1; val != 0; val <<= 1)
            i++;
        System.out.println(i);
	}

}
