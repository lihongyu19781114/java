/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Arcane;
public class Arcane2 {
	// catch clauses that catch Exception or Throwable are legal regardless of the contents of the corresponding try clause.
    public static void main(String[] args) {
        try {
            // If you have nothing nice to say, say nothing
        } catch(Exception e) {
            System.out.println("This can't happen");
        }
    }
}
