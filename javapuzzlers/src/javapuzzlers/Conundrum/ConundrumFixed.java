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

