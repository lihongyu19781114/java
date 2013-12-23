/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Conundrum;
public class Conundrum {
    public static void main(String[] args) {
        Enigma e = new Enigma();
        System.out.println(e.equals(e));
    }
}

final class Enigma {
    // Provide a class body that makes Conundrum print false.
    // Do *not* override equals.
}
