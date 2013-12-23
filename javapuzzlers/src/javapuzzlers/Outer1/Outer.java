/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Outer1;
public class Outer {
    public static void main(String[] args) throws Exception {
        new Outer().greetWorld();
    }

    private void greetWorld() throws Exception {
        System.out.println(Inner.class.newInstance());
    }

    public class Inner {
        public String toString() {
            return "Hello world";
        }
    }
}
