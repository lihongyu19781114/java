/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Lazy;

// keep class initialization as simple as possible.
// waiting for a background thread during class initialization is likely to result in deadlock.

// Bad way to eliminate the deadlock. Complex and error prone.
public class LazyFixed {
	private static boolean initialized = false;

	//	static {
	//		Thread t = new Thread(new Runnable() {
	//			public void run() {
	//				initialized = true;
	//			}
	//		});
	//		t.start();
	//		try {
	//			t.join();
	//		} catch(InterruptedException e) {
	//			throw new AssertionError(e);
	//		}
	//	}
	//
	//	public static void main(String[] args) {
	//		System.out.println(initialized);
	//	}
	private static Thread t = new Thread(new Runnable() {
		public void run() {
			initialized = true;
		}
	});

	static {
		t.start();
	}

	public static void main(String[] args) {
		try {
			t.join();
		} catch (InterruptedException e) {
			throw new AssertionError(e);
		}
		System.out.println(initialized);
	}

}
