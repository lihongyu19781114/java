/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.OneLiners;
import java.util.*;

public class OneLiners {
    public static void main(String[] args) {
        // Part A
        String[] breakfast = { "spam", "sausage", "spam", "spam", "bacon",
                               "spam", "tomato", "spam" };
        System.out.println(withoutDuplicates(Arrays.asList(breakfast)));

        // Part B
        String weaponry = "fear, surprise,ruthless efficiency, an almost " +
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
    static <E> List<E> withoutDuplicates(List<E> original) {
        // Your code goes here
		return original;
    }

    // Part B
    static String[] parse(String string) {
        // Your code goes here
		return null;
    }

    // Part C
    static String arrayToString(Object[] array) {
        // Your code goes here
		return null;
    }

    // Part D
    static boolean hasMoreBitsSet(int i, int j) {
        // Your code goes here
		return false;
    }
}
