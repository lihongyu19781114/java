/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Strange;
public class Strange2 {
    public static void main(String[] args) {
        Missing m;
        try {
            m = new Missing();
        } catch (java.lang.NoClassDefFoundError ex) {
            System.out.println("Got it!");
        }
    }
}
