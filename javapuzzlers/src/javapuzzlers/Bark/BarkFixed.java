/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Bark;

// there is no dynamic dispatch on static methods
// Never qualify a static method invocation with an expression.
// do not hide static methods.

class DogFixed {
    public static void bark() {
        System.out.print("woof ");
    }
}

class BasenjiFixed extends DogFixed {
    public static void bark() { }
}

public class BarkFixed {
    public static void main(String args[]) {
        // DogFixed woofer = new DogFixed();
        // BasenjiFixed nipper = new BasenjiFixed();
        DogFixed.bark();
        BasenjiFixed.bark();
    }
}
