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
