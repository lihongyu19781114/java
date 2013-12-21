package javapuzzlers.Multicast;
public class Multicast {
    public static void main(String[] args) {
    	// Sign extension is performed if the type of the original value is signed;
    	// zero extension if it is a char, regardless of the type to which it is being converted.
    	// If you can't tell what a program does by looking at it, it probably doesn't do what you want.
        System.out.println((int) (char) (byte) -1);
    }
}
