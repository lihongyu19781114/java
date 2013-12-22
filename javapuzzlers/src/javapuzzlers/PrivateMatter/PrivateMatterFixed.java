package javapuzzlers.PrivateMatter;

// avoid hiding.
// A class that hides a field with one whose accessibility is more restrictive than that of the hidden field,
// as in our original program, violates the principle of subsumption,
// also known as the Liskov Substitution Principle [Liskov87].
// This principle says that everything you can do with a base class, you can also do with a derived class.

class BaseFixed {
	public String className = "Base";
}

class DerivedFixed extends BaseFixed {
	//private String className = "Derived";
	public String className = "Derived";
}

public class PrivateMatterFixed {
	public static void main(String[] args) {
		System.out.println(new DerivedFixed().className);
		System.out.println(((BaseFixed)(new DerivedFixed())).className);
	}
}
