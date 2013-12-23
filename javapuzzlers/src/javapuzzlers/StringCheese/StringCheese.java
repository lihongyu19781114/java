/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.StringCheese;
public class StringCheese {
    public static void main(String args[]) {
        byte bytes[] = new byte[256];
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        String str = new String(bytes);
        for(int i = 0, n = str.length(); i < n; i++)
            System.out.print((int)str.charAt(i) + " ");
    }
}
