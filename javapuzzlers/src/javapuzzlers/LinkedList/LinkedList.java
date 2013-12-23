/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.LinkedList;
public class LinkedList<E> {
    private Node<E> head = null;

    private class Node<E> {
        E value;
        Node<E> next;

        // Node constructor links the node as a new head
        Node(E value) {
            this.value = value;
//            this.next = head;
//            head = this;
        }
    }

    public void add(E e) {
        new Node<E>(e);
        // Link node as new head
    }

    public void dump() {
        for (Node<E> n = head; n != null; n = n.next)
            System.out.println(n.value + " ");
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("world");
        list.add("Hello");
        list.dump();
    }
}
