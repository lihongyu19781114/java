/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Tweedledum;
public class Tweedledum {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        short x = 0;
        int i = 123456;
        x += i;     // Must be LEGAL
        //x = x + i;  // Must be ILLEGAL // Won't compile - "possible loss of precision"
    }
}
