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
