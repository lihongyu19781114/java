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
