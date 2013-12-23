/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.BrideOfLooper;
public class BrideOfLooper {
    public static void main(String[] args) {
        // Place your declaration for i here
    	// double i = 0.0 / 0.0;
    	// NaN (short for "Not a Number") is not equal to any floating-point value, including itself.
    	// Any floating-point operation evaluates to NaN if one or more of its operands are NaN.
    	// once it generates NaN, a computation is damaged, and no further computation can repair the damage.
    	double i =Double.NaN;
        while (i != i) {
        }
    }
}
