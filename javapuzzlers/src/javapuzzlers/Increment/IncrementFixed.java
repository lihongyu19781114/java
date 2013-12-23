/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Increment;

public class IncrementFixed {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
			j++; // Do not assign to the same variable more than once in a single expression.
		System.out.println(j);
	}
}
