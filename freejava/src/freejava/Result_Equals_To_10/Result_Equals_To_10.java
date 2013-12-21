/**
 * How to add [+] or [-] to [987654321], let the result equals to [10] ?
 * Result_Equals_To_10.java v1.00
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package freejava.Result_Equals_To_10;

import JAVA.JAVA;

public final class Result_Equals_To_10 {
	public static void main(String[] args) {
		String printString = "";
		// 1:+,2:-,3:&(combine),else:do nothing

		for(int operator = 11111111; operator <= 33333333; operator++) {
			if (1 <= JAVA.getBit(operator, 7) && JAVA.getBit(operator, 7) <= 3 &&
				1 <= JAVA.getBit(operator, 6) && JAVA.getBit(operator, 6) <= 3 &&
				1 <= JAVA.getBit(operator, 5) && JAVA.getBit(operator, 5) <= 3 &&
				1 <= JAVA.getBit(operator, 4) && JAVA.getBit(operator, 4) <= 3 &&
				1 <= JAVA.getBit(operator, 3) && JAVA.getBit(operator, 3) <= 3 &&
				1 <= JAVA.getBit(operator, 2) && JAVA.getBit(operator, 2) <= 3 &&
				1 <= JAVA.getBit(operator, 1) && JAVA.getBit(operator, 1) <= 3 &&
				1 <= JAVA.getBit(operator, 0) && JAVA.getBit(operator, 0) <= 3 ) {

				printString = resultString(operator);

				if(JAVA.arithmetic(printString) == 10.0) {
					System.out.println(printString + " = 10");
				}
			}
		}
	}//public static void main(String[] args)

	private static String resultString (int operator) {
		String returnValue = "";

		if(33333333 == operator) return "987654321+0";

		for(int currentNumber = 9; currentNumber >= 1; currentNumber--) {
			returnValue += currentNumber;
			if(currentNumber > 1) {
				switch(JAVA.getBit(operator, 9 - currentNumber)) {
				case 1:
					returnValue += "+";
					break;
				case 2:
					returnValue += "-";
					break;
				case 3:
					returnValue += ""; // combine
					break;
				default:
					return "X"; // error occurs
				}
			}
		}
		return returnValue;
	}//public static String resultString
}//public final class Result_Equals_To_10
