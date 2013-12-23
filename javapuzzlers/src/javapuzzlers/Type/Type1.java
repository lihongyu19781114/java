/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Type;
public class Type1 {
	// the instanceof operator is defined to return false when its left operand is null.
    public static void main(String[] args) {
        String s = null;
        System.out.println(s instanceof String);
    }
}
