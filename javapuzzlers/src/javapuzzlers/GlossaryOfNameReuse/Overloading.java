package javapuzzlers.GlossaryOfNameReuse;

// Methods in a class overload one another if they have the same name and different signatures.
// The overloaded method designated by an invocation is selected at compile time [JLS 8.4.9, 15.12.2]

class CircuitBreaker {
    public void f(int i)    {
    	System.out.println("int");
    } // int overloading
    public void f(String s) {
    	System.out.println("String");
    } // String overloading
}


public final class Overloading {
	public static void main(String[] args) {
		CircuitBreaker circuitBreaker = new CircuitBreaker();
		circuitBreaker.f(0);	// int
		circuitBreaker.f("");	// String
	}
}
