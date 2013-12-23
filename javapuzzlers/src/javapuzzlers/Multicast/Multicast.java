/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Multicast;
public class Multicast {
	// Sign extension is performed if the type of the original value is signed;
	// zero extension if it is a char, regardless of the type to which it is being converted.
	// If you can't tell what a program does by looking at it, it probably doesn't do what you want.
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
    }
}
