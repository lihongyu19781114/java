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
