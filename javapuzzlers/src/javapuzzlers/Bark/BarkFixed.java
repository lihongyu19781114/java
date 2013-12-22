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
