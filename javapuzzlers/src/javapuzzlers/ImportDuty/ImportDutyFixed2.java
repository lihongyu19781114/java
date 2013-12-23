/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.ImportDuty;

import java.util.Arrays;

public class ImportDutyFixed2 {
	// members that are naturally in scope take precedence over static imports.
	// Use the static import facility sparingly and only when there is a compelling need.
	public static void main(String[] args) {
		printArgs(1, 2, 3, 4, 5);
	}

	static void printArgs(Object... args) {
		System.out.println(toString(args));
	}

	private static String toString(Object[] a) {
		return Arrays.toString(a);
	}
}
