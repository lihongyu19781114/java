package javapuzzlers.DosEquis;

public class DosEquisModified {
	public static void main(String[] args) {
		// Use the same type for the second and third operands in conditional expressions.
        char x = 'X';
        int i = 0;
        System.out.print(true  ? x : 0);
        System.out.print(false ? (char)i : x);
	}
}
