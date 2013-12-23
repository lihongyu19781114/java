/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Reluctant;
public class Reluctant {
	// instance variable initializers run before the body of the constructor
    private Reluctant internalInstance = new Reluctant();

    public Reluctant() throws Exception {
        throw new Exception("I'm not coming out");
    }

    public static void main(String[] args) {
        try {
            Reluctant b = new Reluctant();
            System.out.println("Surprise!");
        } catch (Exception ex) {
            System.out.println("I told you so");
        }
    }
}
