/** Welcome to the Guessnum Game
 * The computer will think of a three digit number with unique digits.
 * After you attempt to guess the number,
 * the computer will tell you how many of your digits match and how many are in the right position.
 * Keeping on submitting three digit numbers until you have guessed the computer's number.
 *
 * If you don't know how to play the game,
 * please visit[http://vicnum.ciphertechs.com/guessnum.html]
 *
 * Guessnum v1.00
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 *
 * */

package freejava.Guessnum;

public final class Guessnum {
	public static void main(String[] args) {

		for(int computerDigitIndex = 0; computerDigitIndex < computerDigitArray.length; computerDigitIndex++) {
			computerDigitArray[computerDigitIndex] = 0;
		}

		for(int player1DigitIndex = 0; player1DigitIndex < player1DigitArray.length; player1DigitIndex++) {
			player1DigitArray[player1DigitIndex] = 0;
		}

		for(int player2DigitIndex = 0; player2DigitIndex < player2DigitArray.length; player2DigitIndex++) {
			player2DigitArray[player2DigitIndex] = 0;
		}

		do {
			for(int computerDigitIndex = 0; computerDigitIndex < computerDigitArray.length; computerDigitIndex++) {
				computerDigitArray[computerDigitIndex] = getRandomDigit();
			}
		} while(!isValidDigitArray(computerDigitArray));

		do {
			do {
				Player1.guess(gametimes, player1DigitArray, player1ResultA, player1ResultB);
			} while(!isValidDigitArray(player1DigitArray));

			do {
				Player2.guess(gametimes, player2DigitArray, player2ResultA, player2ResultB);
			} while(!isValidDigitArray(player2DigitArray));

			checkResult();
			gametimes++ ;
		} while ((player1ResultA < DIGIT_ARRAY_SIZE) && (player2ResultA < DIGIT_ARRAY_SIZE));

		if(player1ResultA > player2ResultA) {
			System.out.println("player1 win!");
		} else if(player1ResultA < player2ResultA) {
			System.out.println("player2 win!");
		} else {
			System.out.println("even game!");
		}
	}

	public static final boolean isValidDigitArray(int[] checkDigitArray) {
		int[] uniqueDigitArray = new int[DIGIT_NUM];
		for(int uniqueDigitIndex = 0; uniqueDigitIndex < uniqueDigitArray.length; uniqueDigitIndex++) {
			uniqueDigitArray[uniqueDigitIndex] = 0;
		}

		for(int checkDigitIndex = 0; checkDigitIndex < checkDigitArray.length; checkDigitIndex++) {
			if((checkDigitArray[checkDigitIndex] < DIGIT_MIN) || (DIGIT_MAX < checkDigitArray[checkDigitIndex])
			|| (++uniqueDigitArray[checkDigitArray[checkDigitIndex]] >= 2)) {
				return false; // DigitArray is invalid[beyond the boundary or repeat]
			}
		}
		return true; // DigitArray is valid
	}

	public static final int getRandomDigit() {
		return (int) (Math.random() * DIGIT_NUM);
	}

	private static final void checkResult() {
		int[] computerUniqueDigitArray = new int[DIGIT_NUM];
		int[] player1UniqueDigitArray  = new int[DIGIT_NUM];
		int[] player2UniqueDigitArray  = new int[DIGIT_NUM];
		for(int uniqueDigitIndex = 0; uniqueDigitIndex < computerUniqueDigitArray.length; uniqueDigitIndex++) {
			computerUniqueDigitArray[uniqueDigitIndex] = 0;
			player1UniqueDigitArray [uniqueDigitIndex] = 0;
			player2UniqueDigitArray [uniqueDigitIndex] = 0;
		}

		player1ResultA = 0;
		player1ResultB = 0;
		player2ResultA = 0;
		player2ResultB = 0;

		// A means how many of your digits are in right position.
		for(int DigitIndex = 0; DigitIndex < computerDigitArray.length; DigitIndex++) {
			if(player1DigitArray[DigitIndex] == computerDigitArray[DigitIndex]){ player1ResultA++; }
			if(player2DigitArray[DigitIndex] == computerDigitArray[DigitIndex]){ player2ResultA++; }

			computerUniqueDigitArray[computerDigitArray[DigitIndex]]++;
			player1UniqueDigitArray [player1DigitArray [DigitIndex]]++;
			player2UniqueDigitArray [player2DigitArray [DigitIndex]]++;
		}

		// B means how many of your digits match but in wrong position.
		for(int uniqueDigitIndex = 0; uniqueDigitIndex < computerUniqueDigitArray.length; uniqueDigitIndex++) {
			if(computerUniqueDigitArray[uniqueDigitIndex] > 0) {
				if(player1UniqueDigitArray [uniqueDigitIndex] > 0) { player1ResultB++; }
				if(player2UniqueDigitArray [uniqueDigitIndex] > 0) { player2ResultB++; }
			}
		}

		player1ResultB -= player1ResultA;
		player2ResultB -= player2ResultA;
	}

	public static final int DIGIT_ARRAY_SIZE = 3;
	public static final int DIGIT_MIN = 0;
	public static final int DIGIT_MAX = 9;
	public static final int DIGIT_NUM = DIGIT_MAX - DIGIT_MIN + 1;

	private static int[] computerDigitArray = new int[DIGIT_ARRAY_SIZE];
	private static int[] player1DigitArray  = new int[DIGIT_ARRAY_SIZE];
	private static int[] player2DigitArray  = new int[DIGIT_ARRAY_SIZE];
	private static int   player1ResultA = 0;
	private static int   player1ResultB = 0;
	private static int   player2ResultA = 0;
	private static int   player2ResultB = 0;
	private static int   gametimes = 0;
}
