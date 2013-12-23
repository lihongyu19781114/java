/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Reflexive;

public class ReflexiveFixed {
	public static void main(String[] args) throws Exception {
		/*
		 * If you can come up with a primitive type and value
		 * that causes this program to print "false", then
		 * you have proven that the == operator is not reflexive.
		 */

		float x = Float.NaN;

		System.out.println(x == x);
	}
}
