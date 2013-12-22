package javapuzzlers.Worker;

import java.util.Timer;
import java.util.TimerTask;

// Internally, Thread.join calls Object.wait on the Thread instance representing the thread being joined.
// This releases the lock for the duration of the wait.
// Don't assume anything about what a library class will or won't do with locks on its instances or on the class,
// beyond what is guaranteed by the class's specification.
// If you need full control over a lock, make sure that no one else can gain access to it.

// In summary, never make assumptions about what a library class will or won't do with its locks.
// To isolate yourself from the use of locks by a library class,
// avoid inheriting from library classes except those specifically designed for inheritance [EJ Item 15]. 

public class WorkerFixed extends Thread {
	private final Object lock = new Object(); // addL=1

	private volatile boolean quittingTime = false;
	public void run() {
		while (!quittingTime)
			pretendToWork();
		System.out.println("Beer is good");
	}
	private void pretendToWork() {
		try {
			Thread.sleep(300); // Sleeping on the job?
		} catch (InterruptedException ex) { }
	}

	// It's quitting time, wait for worker - Called by good boss
	/*synchronized*/ void quit() throws InterruptedException { // chgL=1
		synchronized(lock) { // addL=1
			quittingTime = true;
			join();
		} // addL=1
	}
	// Rescind quitting time - Called by evil boss
	synchronized void keepWorking() {
		synchronized(lock) { // addL=1
			quittingTime = false;
		} // addL=1
	}

	public static void main(String[] args)
	throws InterruptedException {
		final WorkerFixed worker = new WorkerFixed();
		worker.start();

		Timer t = new Timer(true); // Daemon thread
		t.schedule(new TimerTask() {
			public void run() { worker.keepWorking(); }
		}, 500);

		Thread.sleep(400);
		worker.quit();
	}
}
