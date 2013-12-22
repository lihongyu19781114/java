package javapuzzlers.Increment;

public class IncrementFixed {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
			j++; // Do not assign to the same variable more than once in a single expression.
		System.out.println(j);
	}
}
