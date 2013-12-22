/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.AvoidCreatingUnnecessaryObjects;

import JAVA.JAVA;

public final class AvoidCreatingUnnecessaryObjects {

	public static void main(String[] args) {
		System.out.println("Calculates the sum of all the positive int values.");

		System.out.print("Slow Version start at ");JAVA.printCurrentTime();
		Long sum_slow = 0L; // [L]ong // DON'T DO THIS!
		for (long ii = 0; ii < Integer.MAX_VALUE; ii++) {
			sum_slow += ii;
		}
		System.out.println(sum_slow);
		System.out.print("Slow Version end at ");JAVA.printCurrentTime();

		System.out.print("Quick Version start at ");JAVA.printCurrentTime();
		long sum_quick = 0L; // [l]ong // IMPROVED VERSION
		for (long ii = 0; ii < Integer.MAX_VALUE; ii++) {
			sum_quick += ii;
		}
		System.out.println(sum_quick);
		System.out.print("Quick Version end at ");JAVA.printCurrentTime();

		System.out.print("Slow Version start at ");JAVA.printCurrentTime();
		for (long ii = 0; ii < Integer.MAX_VALUE; ii++) {
			String s = new String("stringette"); // DON'T DO THIS!
			s.length();
		}
		System.out.print("Slow Version end at ");JAVA.printCurrentTime();

		System.out.print("Quick Version start at ");JAVA.printCurrentTime();
		for (long ii = 0; ii < Integer.MAX_VALUE; ii++) {
			String s = "stringette"; // IMPROVED VERSION
			s.length();
		}
		System.out.print("Quick Version end at ");JAVA.printCurrentTime();
	}//public static void main(String[] args)

}//public final class AvoidCreatingUnnecessaryObjects
