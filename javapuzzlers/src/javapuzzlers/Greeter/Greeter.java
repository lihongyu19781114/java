/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Greeter;
public class Greeter {
    public static void main (String[] args) {
        String greeting = "Hello world";
        for (int i = 0; i < greeting.length(); i++)
            System.out.write(greeting.charAt(i));
    }
}
