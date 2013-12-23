/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Twisted;

// private members are never inherited [JLS 8.2].
// If you can't tell what a program does by looking at it, it probably doesn't do what you want.
// Strive for clarity.

public class Twisted {
    private final String name;
    Twisted(String name) {
        this.name = name;
    }
    private String name() {
        return name;
    }
    private void reproduce() {
        new Twisted("reproduce") {
            void printName() {
                System.out.println(name());
            }
        }.printName();
    }
    public static void main(String[] args) {
        new Twisted("main").reproduce();
    }
}
