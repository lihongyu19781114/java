/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Null;

public class NullFixed {
	public static void greet() {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {
		// A qualifying expression for a static method invocation is evaluated, but its value is ignored.
//		((Null) null).greet();
		NullFixed.greet();	// Good
		greet();			// Better
	}
}
