/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Increment;
public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++)
            j = j++;
        System.out.println(j);
    }
}
