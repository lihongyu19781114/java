package javapuzzlers.GlossaryOfNameReuse;

// A field, static method, or member type hides all accessible fields, static methods, or member types,
// respectively, with the same name (or, for methods, signature) in supertypes.
// Hiding a member prevents it from being inherited [JLS 8.3, 8.4.8.2, 8.5]

class BaseHiding {
	public static void f() {
		System.out.println("Base");
	}
}

class DerivedHiding extends BaseHiding {
	public static void f() {
		System.out.println("Derived");
	} // hides Base.f()
}

public final class Hiding {
	public static void main(String[] args) {
//		BaseHiding baseHiding = new BaseHiding();
//		DerivedHiding derivedHiding = new DerivedHiding();
//		baseHiding.f();		// Base
//		derivedHiding.f();	// Derived
		BaseHiding.f();		// Base
		DerivedHiding.f();	// Derived
	}
}
