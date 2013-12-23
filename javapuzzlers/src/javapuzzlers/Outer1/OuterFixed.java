/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Outer1;

import java.lang.reflect.Constructor;

// Unless you have a compelling need for an enclosing instance,
// prefer static member classes over nonstatic [EJ Item 18].

public class OuterFixed {
	public static void main(String[] args) throws Exception {
		new OuterFixed().greetWorld();
	}

//	private void greetWorld() throws Exception {
//		System.out.println(Inner.class.newInstance());
//	}

	private void greetWorld() throws Exception {
		Constructor c = Inner.class.getConstructor(OuterFixed.class);

		System.out.println(c.newInstance(OuterFixed.this));
	}

	public class Inner {
		public String toString() {
			return "Hello world";
		}
	}
}
