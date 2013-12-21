/**
 * MrSandMrP.java v1.00
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

/*
We pick two numbers a and b, so that 2 <= a <= b <= 99.
We tell Mr. S. the sum     a + b
and     Mr. P. the product a * b.

Then Mr. S. and Mr. P. engage in the following dialog:
Mr. S.: I knew you didn't know. I don!/t know either.
Mr. P.: Now I know the numbers.
Mr. S.: Now I know them too.

Your task is to find the two numbers.
*/

package freejava.MrSandMrP;

import JAVA.JAVA;

public final class MrSandMrP {
	public static void main(String[] args) {
		// Mr. S.: I knew you didn't know. I don't know either.[START]
		// Initialize[START]
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					numberPossibility        [numberA][numberB] = UNKNOWN;
					sumPossibilityCounter    [numberA+numberB][UNKNOWN]    = 0;
					sumPossibilityCounter    [numberA+numberB][IMPOSSIBLE] = 0;
					productPossibilityCounter[numberA*numberB][UNKNOWN]    = 0;
					productPossibilityCounter[numberA*numberB][IMPOSSIBLE] = 0;
				}
			}
		}
		// Initialize[END]
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					if(JAVA.canBeExpressedAsTheSumOfTwoPrimes(numberA+numberB)) {
						// Mr. S. knew Mr. P. didn't know.
						numberPossibility[numberA][numberB] = IMPOSSIBLE;
					}

					sumPossibilityCounter[numberA+numberB][
						numberPossibility[numberA][numberB]
					]++;

					productPossibilityCounter[numberA*numberB][
						numberPossibility[numberA][numberB]
					]++;
				}
			}
		}
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					if(sumPossibilityCounter[numberA+numberB][UNKNOWN] <= 1) {
						// Mr. S. doesn't know either.
						numberPossibility[numberA][numberB] = IMPOSSIBLE;
					}
				}
			}
		}
		// Mr. S.: I knew you didn't know. I don't know either.[END]

		// Mr. P.: Now I know the numbers.[START]
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					if(productPossibilityCounter[numberA*numberB][UNKNOWN] != 1
					|| productPossibilityCounter[numberA*numberB][UNKNOWN]  < 1) {
						// Mr. P. knows the numbers.
						numberPossibility[numberA][numberB] = IMPOSSIBLE;
					}
				}
			}
		}
		// Mr. P.: Now I know the numbers.[END]

		// Mr. S.: Now I know them too.[START]
		// Clear[START]
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					sumPossibilityCounter    [numberA+numberB][UNKNOWN]    = 0;
					sumPossibilityCounter    [numberA+numberB][IMPOSSIBLE] = 0;
				}
			}
		}
		// Clear[END]
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					sumPossibilityCounter[numberA+numberB][
						numberPossibility[numberA][numberB]
					]++;
				}
			}
		}
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					if(sumPossibilityCounter[numberA+numberB][UNKNOWN] != 1) {
						// Mr. S. knows the numbers.
						numberPossibility[numberA][numberB] = IMPOSSIBLE;
					}
				}
			}
		}
		// Mr. S.: Now I know them too.[END]

		// Print the result.[START]
		for(int numberA = LOWERBOUND; numberA <= UPPERBOUND; numberA++) {
			for(int numberB = LOWERBOUND; numberB <= UPPERBOUND; numberB++) {
				if(numberA <= numberB) {
					if(numberPossibility[numberA][numberB] != IMPOSSIBLE) {
						System.out.printf(
							"a=%d,b=%d,%d+%d=%d,%d*%d=%d\n",
							numberA, numberB,
							numberA, numberB, numberA+numberB,
							numberA, numberB, numberA*numberB
    					);
					}
				}
			}
		}
		// Print the result.[END]
	}//public static void main(String[] args)

	// POSSIBILITY
	static final int UNKNOWN    = 0;
	static final int IMPOSSIBLE = 1;

	static final int LOWERBOUND =  2;
	static final int UPPERBOUND = 99;
	static int numberPossibility         [][]  = new int[ UPPERBOUND+1 ] [ UPPERBOUND+1 ];   //Value :UNKNOWN or IMPOSSIBLE
	static int sumPossibilityCounter     [][]  = new int[(UPPERBOUND+1) + (UPPERBOUND+1)][2];//Index0:UNKNOWN,Index1:IMPOSSIBLE
	static int productPossibilityCounter [][]  = new int[(UPPERBOUND+1) * (UPPERBOUND+1)][2];//Index0:UNKNOWN,Index1:IMPOSSIBLE
}//public final class MrSandMrP
