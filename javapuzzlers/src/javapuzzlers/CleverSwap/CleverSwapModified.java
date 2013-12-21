package javapuzzlers.CleverSwap;

public class CleverSwapModified {
	public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("x = " + x + "; y = " + y);
	}
}
