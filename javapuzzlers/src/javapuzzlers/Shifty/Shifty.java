/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Shifty;
public class Shifty {
    public static void main(String[] args) {
        int i = 0;
        while (-1 << i != 0)
            i++;
        System.out.println(i);
    }
}
