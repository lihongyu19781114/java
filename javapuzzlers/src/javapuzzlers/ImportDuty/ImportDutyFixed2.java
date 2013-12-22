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
