/** Guessnum v1.00
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 *
 * */

package freejava.Guessnum;

public class Player1 extends Player {
	public static void guess(int gametimes, int[] playerDigitArray, int playerResultA, int playerResultB) {
//		System.out.println("Player1.guess");
		do {
			for(int playerDigitIndex = 0; playerDigitIndex < playerDigitArray.length; playerDigitIndex++) {
				playerDigitArray[playerDigitIndex] = Guessnum.getRandomDigit();
			}
		} while(!Guessnum.isValidDigitArray(playerDigitArray));
	}
}
