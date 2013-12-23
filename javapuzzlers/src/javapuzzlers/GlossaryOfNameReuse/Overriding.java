/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.GlossaryOfNameReuse;

// An instance method overrides all accessible instance methods with the same signature in superclasses [JLS 8.4.8.1],
// enabling dynamic dispatch;
// in other words, the VM chooses which overriding to invoke based on an instance's run-time type [JLS 15.12.4.4].
// Overriding is fundamental to object-oriented programming and is the only form of name reuse that is not generally discouraged.

class BaseOverriding {
	public void f() {
		System.out.println("Base");
	}
}

class DerivedOverriding extends BaseOverriding {
	public void f() {
		System.out.println("Derived");
	} // overrrides Base.f()
}

public final class Overriding {
	public static void main(String[] args) {
		BaseOverriding baseOverriding = new BaseOverriding();
		DerivedOverriding derivedOverriding = new DerivedOverriding();
		baseOverriding.f();		// Base
		derivedOverriding.f();	// Derived
	}
}
