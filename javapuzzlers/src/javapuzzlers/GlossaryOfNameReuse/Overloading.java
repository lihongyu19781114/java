/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

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
