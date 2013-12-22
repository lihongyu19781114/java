package javapuzzlers.CurseOfLooper;
public class CurseOfLooper {
	// there is a fundamental difference in the way
	// numerical comparison operators and
	// equality operators behave when both operands are of boxed numeric types:
	// Numerical comparison operators perform value comparisons,
	// while equality operators perform reference identity comparisons.
    public static void main(String[] args) {
        // Place your declarations for i and j here
    	Integer i = new Integer(0);
    	Integer j = new Integer(0);

        while (i <= j && j <= i && i != j) {
        }
    }
}
