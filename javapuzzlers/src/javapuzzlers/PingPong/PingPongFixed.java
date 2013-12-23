/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.PingPong;

// Be careful not to invoke a thread's run method when you mean to invoke its start method.

public final class PingPongFixed {
	public static synchronized void main(String[] args) {
		Thread t = new Thread() {
			public void run() { pong(); }
		};
		t.start();//t.run();
		System.out.print("Ping");
	}

	static synchronized void pong() {
		System.out.print("Pong");
	}
}
