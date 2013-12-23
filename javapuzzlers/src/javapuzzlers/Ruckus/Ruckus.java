/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Ruckus;
class Counter {
    private static int count = 0;
    public static final synchronized void increment() {
        count++;
    }
    public static final synchronized int getCount() {
        return count;
    }
}

class Dog extends Counter {
    public Dog() { }
    public void woof() { increment(); }
}

class Cat extends Counter {
    public Cat() { }
    public void meow() { increment(); }
}

public class Ruckus {
    public static void main(String[] args) {
        Dog dogs[] = { new Dog(), new Dog() };
        for (int i = 0; i < dogs.length; i++)
            dogs[i].woof();
        Cat cats[] = { new Cat(), new Cat(), new Cat() };
        for (int i = 0; i < cats.length; i++)
            cats[i].meow();
        System.out.print(Dog.getCount() + " woofs and ");
        System.out.println(Cat.getCount() + " meows");
    }
}
