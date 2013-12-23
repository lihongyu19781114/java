/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.CurseOfLooper;
public class CurseOfLooper {
	// there is a fundamental difference in the way
	// numerical comparison operators and
	// equality operators behave when both operands are of boxed numeric types:
	// Numerical comparison operators perform value comparisons,
	// while equality operators perform reference identity comparisons.
    public static void main(String[] args) {
        // Place your declarations for i and j here
    	Integer i = new Integer(0);
    	Integer j = new Integer(0);

        while (i <= j && j <= i && i != j) {
        }
    }
}
