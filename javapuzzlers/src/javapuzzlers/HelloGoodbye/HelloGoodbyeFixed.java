/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.HelloGoodbye;

public class HelloGoodbyeFixed {
	// The System.exit method halts the execution of the current thread and all others dead in their tracks.
	// Use shutdown hooks for behavior that must occur before the VM exits.
	// Never call System.runFinalizersOnExit or Runtime.runFinalizersOnExit for any reason:
	// They are among the most dangerous methods in the Java libraries [ThreadStop].
    public static void main(String[] args) {
    	System.out.println("Hello world");

    	Runtime.getRuntime().addShutdownHook(
    			new Thread() {
    				public void run() {
    					System.out.println("Goodbye world");
    				}
    			}
    	);

    	System.exit(0);
    }
}
