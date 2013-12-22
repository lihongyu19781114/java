package javapuzzlers.Looper;
public class Looper {
	// In summary, it is possible to represent infinity as a double or a float.
	// adding a small floating-point value to a large one will not change the large value.
	// binary floating-point arithmetic is only an approximation to real arithmetic.
    public static void main(String[] args) {
        // Place your declaration for i here
    	float i = 33554432;
        while (i == i + 1) {
        	System.out.println(
        			"i     = " +  i + ";" +
        			"i + 1 = " + (i + 1));
        }
        System.out.println("loop over!");
    }
}
