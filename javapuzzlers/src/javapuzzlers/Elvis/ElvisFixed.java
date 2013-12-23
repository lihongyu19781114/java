/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Elvis;

import java.util.Calendar;

public class ElvisFixed {
	// it is possible to observe a final static field before it is initialized
	// To fix a class initialization cycle, reorder the static field initializers so that
	// each initializer appears before any initializers that depend on it.

	// be careful of class initialization cycles
	// Some common design patterns are naturally subject to initialization cycles, notably the Singleton [Gamma95],
	// which is illustrated in this puzzle,
	// and the Service Provider Framework [EJ Item 1].
	// The Typesafe Enum pattern [EJ Item 21] also causes class initialization cycles.

	// public static final ElvisFixed INSTANCE = new ElvisFixed();
	private static int beltSize = 0;
	private static final int CURRENT_YEAR =
		Calendar.getInstance().get(Calendar.YEAR);

	private ElvisFixed() {
		beltSize = CURRENT_YEAR - 1930;
	}

	public int beltSize() {
		return beltSize;
	}

	public static void main(String[] args) {
		ElvisFixed elvisfixed = new ElvisFixed();
		System.out.println("Elvis wears a size " +
				elvisfixed.beltSize() + " belt.");
	}
}
