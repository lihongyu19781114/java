/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Thrower;

public class ThrowerFixed {
	// Generic type information is checked at compile time but not at run time
	// When you get an unchecked cast warning, modify your program to eliminate it, or convince yourself that the cast cannot fail.
	// Java's exception checking is not enforced by the virtual machine.
	// do not ignore compiler warnings.
	public static void main(String[] args) {
		sneakyThrow(new Exception("This is a checked exception"));
	}

	/*
	 * Provide a body for this method to make it throw the specified exception.
	 * You must not use any deprecated methods.
	 */
	public static void sneakyThrow(Throwable t) {

	}
}
