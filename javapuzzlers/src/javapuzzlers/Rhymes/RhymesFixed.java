/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Rhymes;

import java.util.Random;

public class RhymesFixed {
	private static Random rnd = new Random();

	public static void main(String[] args) {
		StringBuffer word = null;
		// The specification for Random.nextInt(int) says:
		// "Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive)"
		switch(rnd.nextInt(3)) { // Watch out for fencepost errors.
		case 1:
			word = new StringBuffer("P"); // Use familiar idioms and APIs whenever possible. If you must use unfamiliar APIs, read the documentation carefully.
			break; // Don't fall through from one nonempty case to another.
		case 2:
			word = new StringBuffer("G"); // Use familiar idioms and APIs whenever possible. If you must use unfamiliar APIs, read the documentation carefully.
			break; // Don't fall through from one nonempty case to another.
		default:
			word = new StringBuffer("M"); // Use familiar idioms and APIs whenever possible. If you must use unfamiliar APIs, read the documentation carefully.
			break; // Don't fall through from one nonempty case to another.
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
	}

}
