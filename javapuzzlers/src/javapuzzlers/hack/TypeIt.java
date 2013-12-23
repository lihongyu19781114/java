/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.hack;

import javapuzzlers.click.CodeTalk;

public class TypeIt {
    private static class ClickIt extends CodeTalk {
    	// A package-private method cannot be directly overridden by a method in a different package [JLS 8.4.8.1].
        void printMessage() {
            System.out.println("Hack");
        }
    }

    public static void main(String[] args) {
        ClickIt clickit = new ClickIt();
        clickit.doIt();
    }
}
