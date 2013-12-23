/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Desserts;
import java.util.*;
public class BananaBread {
    public static void main(String[] args) {
        Integer[] array = { 3, 1, 4, 1, 5, 9 };
        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i1 < i2 ? -1 : (i2 > i1 ? 1 : 0);
            }
        });
        System.out.println(Arrays.toString(array));
    }
}
