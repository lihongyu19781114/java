/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.LinkedList;

// Avoid shadowing type parameter names.
// An inner class of a generic class has access to the type parameters of its outer class.
// prefer static member classes over nonstatic [EJ Item 18].
// Change instance fields of a class only in its own instance methods.

// Fixed but could be MUCH better
public class LinkedListFixed1<E> {
	private Node head = null;
	private class Node {
		E value;
		Node next;
		// Node constructor links the node as a new head
		Node(E value) {
			this.value = value;
			this.next = head;
			head = this;
		}
	}
	public void add(E e) {
		new Node(e);
		// Link node as new head
	}
	public void dump() {
		for (Node n = head; n != null; n = n.next)
			System.out.print(n.value + " ");
	}
}
