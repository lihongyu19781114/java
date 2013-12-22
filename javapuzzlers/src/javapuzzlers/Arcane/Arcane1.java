package javapuzzlers.Arcane;
/*import java.io.IOException;*/

public class Arcane1 {
	// it is a compile-time error for a catch clause to catch a checked exception type E
	// if the corresponding TRy clause can't throw an exception of some subtype of E
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
        } catch(/*IOException e*/Exception e) {
            System.out.println("I've never seen println fail!");
        }
    }
}
