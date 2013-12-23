/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Dog;
public class Dog extends Exception {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public static final Dog INSTANCE = new Dog();
    private Dog() { }

    public String toString() {
        return "Woof";
    }

//    private Object readResolve() {
//        // Accept no substitutes!
//        return INSTANCE;
//    }
}
