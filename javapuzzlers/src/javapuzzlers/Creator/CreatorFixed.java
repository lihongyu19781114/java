/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Creator;

import java.util.concurrent.atomic.AtomicLong;

public class CreatorFixed {
	// when using a variable to count instance creations, use a long rather than an int, to prevent overflow.
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			// A local variable declaration can appear only as a statement directly within a block.
			CreatureFixed creature = new CreatureFixed();
		}
		System.out.println(CreatureFixed.numCreated());
	}
}

//Thread-safe creation counter using AtomicLong;
class CreatureFixed {
	private static AtomicLong numCreated = new AtomicLong();

	public CreatureFixed() {
		numCreated.incrementAndGet();
	}

	public static long numCreated() {
		return numCreated.get();
	}
}
