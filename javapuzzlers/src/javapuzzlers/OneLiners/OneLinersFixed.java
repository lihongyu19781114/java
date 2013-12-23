/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.OneLiners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class OneLinersFixed {
	// Knowing what's in the libraries can save you lots of time and effort and can enhance the speed and quality of your programs.

	public static void main(String[] args) {
		// Part A
		String[] breakfast = { "spam", "sausage", "spam", "spam", "bacon",
				"spam", "tomato", "spam" };
		System.out.println(withoutDuplicates(Arrays.asList(breakfast)));

		// Part B
		String weaponry = "fear, surprise, ruthless efficiency, an almost " +
		"fanatical devotion to the Pope, nice red uniforms";
		System.out.println(Arrays.asList(parse(weaponry)));

		// Part C
		int[][] magic = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
		System.out.println(arrayToString(magic));

		// Part D
		System.out.println(hasMoreBitsSet(0x0f0f0f0f, 0x88888888)); // true
		System.out.println(hasMoreBitsSet(0x88888888, 0x0f0f0f0f)); // false
	}

	// Part A
	// Write a method that takes a List of elements
	// and returns a new List containing the same elements in the same order with the second
	// and subsequent occurrences of any duplicate elements removed.

	// For example,
	// if you pass in a list containing "spam", "sausage", "spam", "spam", "bacon", "spam", "tomato", and "spam",
	// you'll get back a new list containing "spam", "sausage", "bacon", and "tomato".
	static <E> List<E> withoutDuplicates(List<E> original) {
		// Your code goes here
		return new ArrayList<E>(new LinkedHashSet<E>(original));
	}

	// Part B
	// Write a method that takes a string containing zero or more tokens separated by commas
	// and returns an array of strings representing the tokens in the order they occur in the input string.
	// Each comma may be followed by zero or more white space characters, which must be ignored by the method.

	// For example,
	// if you pass the string "fear, surprise, ruthless efficiency, an almost fanatical devotion to the Pope, nice red uniforms",
	// you'll get back a five-element string array containing "fear", "surprise", "ruthless efficiency", "an almost fanatical devotion to the Pope", and "nice red uniforms".
	static String[] parse(String string) {
		// Your code goes here
		return string.split(",\\S*");
	}

	// Part C
	// Suppose that you have a multidimensional array that you want to print for debugging purposes.
	// You don't know how many levels the array has or what type of objects are stored at each level in the array.
	// Write a method that shows you all the elements at each level.
	static String arrayToString(Object[] array) {
		// Your code goes here
		return Arrays.deepToString(array);
	}

	// Part D
	// Write a method that takes two int values
	// and returns TRue if the first value has more bits set than the second in its two's-complement binary representation.
	static boolean hasMoreBitsSet(int i, int j) {
		// Your code goes here
		return (Integer.bitCount(i) > Integer.bitCount(j));
	}
}
