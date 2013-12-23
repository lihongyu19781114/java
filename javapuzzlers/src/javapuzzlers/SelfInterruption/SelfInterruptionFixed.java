/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.SelfInterruption;

// Calling Thread.interrupted always clears the interrupted status of the current thread.
// Don't use THRead.interrupted unless you want to clear the interrupted status of the current thread.

public class SelfInterruptionFixed {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();

		if (Thread.currentThread().isInterrupted()) {
			System.out.println("Interrupted: " + Thread.currentThread().isInterrupted());
		} else {
			System.out.println("Not interrupted: " + Thread.currentThread().isInterrupted());
		}
	}
}
