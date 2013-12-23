/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.CleverSwap;
public class CleverSwap {
    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}
