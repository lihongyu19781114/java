package effectivejava.BewareThePerformanceOfStringConcatenation;

import JAVA.JAVA;

public final class BewareThePerformanceOfStringConcatenation {
	public static void main(String[] args) {
		System.out.print("statement_PerformsHorribly start:");JAVA.printCurrentTime();
		statement_PerformsHorribly();
		System.out.print("statement_PerformsHorribly end:");JAVA.printCurrentTime();

		System.out.print("statement_PerformsGood start:");JAVA.printCurrentTime();
		statement_PerformsGood();
		System.out.print("statement_PerformsGood end:");JAVA.printCurrentTime();
	}

	//Inappropriate use of string concatenation - Performs horribly!
	private static String statement_PerformsHorribly() {
		String result = "";
		for (int i = 0; i < numItems(); i++)
			result += lineForItem(i); // String concatenation
		return result;
	}

	//To achieve acceptable performance, use a StringBuilder in place of a String.
	private static String statement_PerformsGood() {
		StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
		for (int i = 0; i < numItems(); i++)
			b.append(lineForItem(i));
		return b.toString();
	}

	private static int numItems() { return LINE_WIDTH; }
	private static String lineForItem(int i) {
		String return_value = "";
		for(int ii = 1; ii < LINE_WIDTH; ii++) {
			return_value += i;
		}
		return return_value;
	}
	private final static int LINE_WIDTH = 1000;
}
