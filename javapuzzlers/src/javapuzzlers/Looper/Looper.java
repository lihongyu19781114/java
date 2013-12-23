/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Looper;
public class Looper {
	// In summary, it is possible to represent infinity as a double or a float.
	// adding a small floating-point value to a large one will not change the large value.
	// binary floating-point arithmetic is only an approximation to real arithmetic.
    public static void main(String[] args) {
        // Place your declaration for i here
    	float i = 33554432;
        while (i == i + 1) {
        	System.out.println(
        			"i     = " +  i + ";" +
        			"i + 1 = " + (i + 1));
        }
        System.out.println("loop over!");
    }
}
