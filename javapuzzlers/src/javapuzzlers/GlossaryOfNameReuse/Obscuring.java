/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.GlossaryOfNameReuse;

// A variable obscures a type with the same name if both are in scope:
// If the name is used where variables and types are permitted, it refers to the variable.
// Similarly, a variable or a type can obscure a package.
// Obscuring is the only kind of name reuse where the two names are in different namespaces: variables, packages, methods, or types.
// If a type or a package is obscured,
// you cannot refer to it by its simple name except in a context where the syntax allows only a name from its namespace.
// Adhering to the naming conventions largely eliminates obscuring [JLS 6.3.2, 6.5]

public final class Obscuring {

	static String System; // Obscures type java.lang.System

	public static void main(String[] args) {
		// Next line won't compile: System refers to static field
//        System.out.println("hello, obscure world!");
	}
}
