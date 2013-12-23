/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Indecisive;
public class Indecisive {
	// in a try-finally statement, the finally block is always executed when control leaves the try block
	// Never exit a finally block with a return, break, continue, or tHRow,
	// and never allow a checked exception to propagate out of a finally block.
    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
