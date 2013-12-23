/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Tweedledee;
public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
    	Object x = "Buy ";
    	String i = "Effective Java!";

        x = x + i;  // Must be LEGAL
        //x += i;     // Must be ILLEGAL
    }
}
