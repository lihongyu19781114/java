package javapuzzlers.Arcane;
interface Type1 {
    void f() throws CloneNotSupportedException;
}

interface Type2 {
    void f() throws InterruptedException;
}

interface Type3 extends Type1, Type2 {
}

public class Arcane3 implements Type3 {
	// The set of checked exceptions that a method can throw is the intersection of the sets of checked exceptions
	// that it is declared to throw in all applicable types
    public void f() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        Type3 t3 = new Arcane3();
        t3.f();
    }
}
