/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.ShadesOfGray;

// When a variable and a type have the same name and both are in scope,
// the variable name takes precedence [JLS 6.5.2].
// Similarly, variable and type names can obscure package names.

// Fortunately, programs that obey the standard Java naming conventions almost never encounter this issue.
// Classes begin with a capital letter and are written in MixedCase,
// variables begin with a lowercase letter and are written in mixedCase,
// and constants begin with a capital letter and are written in ALL_CAPS.
// Single capital letters are used only for type parameters,
// as in the generic interface Map<K, V>.
// Package names are written in lower.case [JLS 6.8].

// To avoid conflict between constant names and class names,
// treat acronyms as ordinary words in class names [EJ Item 38].
// For example, a class representing a universally unique identifier
// should be named Uuid rather than UUID, even though the acronym is typically written UUID.
// (The Java platform libraries violate this advice with such class names as UUID, URL, and URI.)
// To avoid conflicts between variable names and package names,
// don't use a top-level package or domain name as a variable name.
// Specifically, don't name a variable com, org, net, edu, java, or javax.

public class ShadesOfGrayFixed {
	public static void main(String[] args){
		System.out.println(Ex.Why.z);
	}
}

class Ex {
	static class Why {
		static String z = "Black";
	}
	static See y = new See();
}

class See {
	String z = "White";
}
