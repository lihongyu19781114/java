/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.LinkedList;

// A better fix
public class LinkedListFixed2<E> {
	private Node<E> head = null;
	private static class Node<T> {
		T value; Node<T> next;
		Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}
	}
	public void add(E e) {
		head = new Node<E>(e, head);
	}
	public void dump() {
		for (Node<E> n = head; n != null; n = n.next)
			System.out.print(n.value + " ");
	}
}
