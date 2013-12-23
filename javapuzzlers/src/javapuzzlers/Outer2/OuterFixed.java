/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Outer2;

// Whenever you write a member class, ask yourself,
// Does this class really need an enclosing instance?
// If the answer is no, make it static.

// it is rarely appropriate to extend an inner class;
// if you must, think long and hard about the enclosing instance.

public class OuterFixed {
	class Inner1 extends OuterFixed { }
	class Inner2 extends Inner1 {
		public Inner2() {
			OuterFixed.this.super();
		}
	}
}
