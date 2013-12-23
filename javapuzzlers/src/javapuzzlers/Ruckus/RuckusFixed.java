/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Ruckus;
// A single copy of each static field is shared among its declaring class and all subclasses
// When designing one class to build on the behavior of another,
// you have two options:
//  inheritance, in which one class extends the other;
//  or composition, in which one class contains an instance of the other.
// Choose based on whether each instance of one class is an instance of the other class
// or has an instance of the other.
//  In the first case, use inheritance;
//  in the second, use composition.
//  When in doubt, favor composition over inheritance [EJ Item 14].
class CounterFixed {
	private static int count = 0;
	public static synchronized void increment() {
		count++;
	}
	public static synchronized int getCount() {
		return count;
	}
}

class DogFixed extends CounterFixed {
	private static int woofcount = 0;
	public DogFixed() { }
	public void woof() { increment(); }
	public static final synchronized void increment() {
		woofcount++;
	}
	public static final synchronized int getCount() {
		return woofcount;
	}
}

class CatFixed extends CounterFixed {
	private static int meowcount = 0;
	public CatFixed() { }
	public void meow() { increment(); }
	public static final synchronized void increment() {
		meowcount++;
	}
	public static final synchronized int getCount() {
		return meowcount;
	}
}

public class RuckusFixed {
	public static void main(String[] args) {
		DogFixed dogs[] = { new DogFixed(), new DogFixed() };
		for (int i = 0; i < dogs.length; i++)
			dogs[i].woof();
		CatFixed cats[] = { new CatFixed(), new CatFixed(), new CatFixed() };
		for (int i = 0; i < cats.length; i++)
			cats[i].meow();
		System.out.print(DogFixed.getCount() + " woofs and ");
		System.out.println(CatFixed.getCount() + " meows");
	}
}
