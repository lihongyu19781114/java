/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.com.javapuzzlers;

import java.util.regex.Pattern;

public class MeFixed {
	public static void main(String[] args) {
		System.out.println(
				MeFixed.class.getName().replaceAll("\\.", "/") + ".class"); // Good
		System.out.println(
				MeFixed.class.getName().replaceAll(Pattern.quote("."), "/") + ".class"); // Better

		// The problem is that String.replaceAll takes a regular expression as its first parameter,
		// not a literal sequence of characters.
		System.out.println(
				MeFixed.class.getName().replaceAll(Pattern.quote("."), Pattern.quote("/")) + ".class"); // NG
	}
}
