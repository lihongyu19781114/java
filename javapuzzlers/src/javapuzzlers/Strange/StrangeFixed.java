package javapuzzlers.Strange;

public class StrangeFixed {
	// To write a program that can detect when a class is missing,
	// use reflection to refer to the class rather than the usual language constructs
	// do not depend on catching NoClassDefFoundError.
	// it is rarely appropriate to catch Error or its subclasses.
    public static void main(String[] args) throws Exception{
        try {
            Object m = Class.forName("javapuzzlers.Strange.Missing").newInstance();
        } catch (java.lang.ClassNotFoundException ex) {
            System.err.println("Got it!");
        }
    }
}