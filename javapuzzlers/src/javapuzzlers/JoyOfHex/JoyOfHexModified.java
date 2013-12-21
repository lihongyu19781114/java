package javapuzzlers.JoyOfHex;

public class JoyOfHexModified {
	public static void main(String[] args) {
		// It is generally best to avoid mixed-type computations.
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabeL));
	}
}
