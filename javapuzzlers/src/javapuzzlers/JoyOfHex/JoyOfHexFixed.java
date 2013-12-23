/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.JoyOfHex;

public class JoyOfHexFixed {
	public static void main(String[] args) {
		// It is generally best to avoid mixed-type computations.
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL));
	}
}
