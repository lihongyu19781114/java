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
