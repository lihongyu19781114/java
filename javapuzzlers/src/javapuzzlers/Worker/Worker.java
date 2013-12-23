/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Worker;
import java.util.*;

public class Worker extends Thread {
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
    synchronized void quit() throws InterruptedException {
        quittingTime = true;
        join();
    }
    // Rescind quitting time - Called by evil boss
    synchronized void keepWorking() {
        quittingTime = false;
    }

    public static void main(String[] args)
            throws InterruptedException {
        final Worker worker = new Worker();
        worker.start();

        Timer t = new Timer(true); // Daemon thread
        t.schedule(new TimerTask() {
            public void run() { worker.keepWorking(); }
        }, 500);

        Thread.sleep(400);
        worker.quit();
    }
}
