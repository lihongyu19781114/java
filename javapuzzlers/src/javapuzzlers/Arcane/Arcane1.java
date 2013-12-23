/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Arcane;
/*import java.io.IOException;*/

public class Arcane1 {
	// it is a compile-time error for a catch clause to catch a checked exception type E
	// if the corresponding TRy clause can't throw an exception of some subtype of E
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
        } catch(/*IOException e*/Exception e) {
            System.out.println("I've never seen println fail!");
        }
    }
}
