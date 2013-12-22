/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.EliminateObsoleteObjectReferences;

import java.util.*;

public final class EliminateObsoleteObjectReferences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}//public static void main(String[] args)

	// Can you spot the "memory leak"?
	public class Stack {
		private Object[] elements;
		private int size = 0;
		private static final int DEFAULT_INITIAL_CAPACITY = 16;

		public Stack() {
			elements = new Object[DEFAULT_INITIAL_CAPACITY];
		}

		public void push(Object e) {
			ensureCapacity();
			elements[size++] = e;
		}

		/*public Object pop() {
			if (size == 0)
				throw new EmptyStackException();
			return elements[--size]; // DON'T DO THIS!
		}*/

		public Object pop() {
			if (size == 0)
			throw new EmptyStackException();
			Object result = elements[--size];
			elements[size] = null; // Eliminate obsolete reference // IMPROVED VERSION
			return result;
		}

		/**
		 * Ensure space for at least one more element, roughly doubling the
		 * capacity each time the array needs to grow.
		 */
		private void ensureCapacity() {
//			if (elements.length == size)
//				elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

}//public final class EliminateObsoleteObjectReferences
