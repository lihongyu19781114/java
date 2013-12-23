/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.StrungOut;

// Avoid reusing the names of platform classes, and never reuse class names from java.lang

public class StrungOutFixed {

	public static void main(String[] args) {
		MyString s = new MyString("Hello world");
		System.out.println(s);
	}

}

class MyString {
	private final java.lang.String s;

	public MyString(java.lang.String s) {
		this.s = s;
	}

	public java.lang.String toString() {
		return s;
	}
}