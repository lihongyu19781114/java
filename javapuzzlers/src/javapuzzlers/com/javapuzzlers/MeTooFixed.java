/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.com.javapuzzlers;

import java.io.File;
import java.util.regex.Matcher;

public class MeTooFixed {
	public static void main(String[] args) {
//		System.out.println(MeTooModified.class.getName().
//				replaceAll("\\.", File.separator) + ".class");
//		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 1
//		at java.lang.String.charAt(String.java:558)
//		at java.util.regex.Matcher.appendReplacement(Matcher.java:696)
//		at java.util.regex.Matcher.replaceAll(Matcher.java:806)
//		at java.lang.String.replaceAll(String.java:2000)
//		at javapuzzlers.com.javapuzzlers.MeTooModified.main(MeTooModified.java:8)

		// Be careful when using unfamiliar library methods.
		// For many programmers, it is not easy to remember
		// which string-replacement methods use literal strings and
		// which ones use regular expressions or replacement strings.
		System.out.println(MeTooFixed.class.getName().
				replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class"); // Good

		System.out.println(MeTooFixed.class.getName().
				replace(".", File.separator) + ".class"); // Better
	}
}
