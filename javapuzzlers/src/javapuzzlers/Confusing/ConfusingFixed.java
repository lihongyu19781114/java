package javapuzzlers.Confusing;

public class ConfusingFixed {
	// the test for which method or constructor is most specific does not use the actual parameters:
	// the parameters appearing in the invocation.
	// to force the compiler to select a specific overloading,
	// cast actual parameters to the declared types of the formal parameters.
	// avoid overloading[reduce the need for overloading with the Builder pattern]
	private ConfusingFixed(Object o) {
		System.out.println("Object");
	}

	private ConfusingFixed(double[] dArray) {
		System.out.println("double array");
	}

	public static void main(String[] args) {
		new ConfusingFixed((Object)null);
		new ConfusingFixed((double[])null);
	}
}
