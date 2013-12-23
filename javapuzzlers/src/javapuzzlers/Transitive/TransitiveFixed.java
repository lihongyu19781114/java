/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Transitive;

// Converting an int or a long value to float, or a long value to double can result in loss of precision.
// Beware of lossy widening primitive conversions to float and double.

public class TransitiveFixed {
	public static void main(String[] args) throws Exception {
		/*
		 * If you can come up with a set of primitive types and values
		 * that causes this program to print "true true false", then
		 * you have proven that the == operator is not transitive.
		 */
		long x = Long.MAX_VALUE;
		double y = (double)Long.MAX_VALUE;
		long z = Long.MAX_VALUE - 1;

		System.out.print ((x == y) + " ");	// Imprecise![true]
		System.out.print ((y == z) + " ");	// Imprecise![true]
		System.out.println(x == z);			// Precise   [false]
	}
}
