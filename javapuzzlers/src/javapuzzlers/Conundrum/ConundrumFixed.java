/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Conundrum;

public class ConundrumFixed {
	// If two overloadings of the same method can be applied to some parameters,
	// they should have identical behavior.
	public static void main(String[] args) {
		EnigmaFixed e = new EnigmaFixed();
		System.out.println(e.equals(e));
	}
}

final class EnigmaFixed {
    // Provide a class body that makes Conundrum print false.
    // Do *not* override equals.
	public boolean equals(EnigmaFixed other) { // Although the puzzle forbids you to override Object.equals, you are permitted to overload it
		return false;
	}
}

