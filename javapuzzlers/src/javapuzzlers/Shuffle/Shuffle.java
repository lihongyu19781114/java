/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Shuffle;
import java.util.Random;

public class Shuffle {
    private static Random rnd = new Random();
    public static void shuffle(Object[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, rnd.nextInt(a.length));
    }

    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
