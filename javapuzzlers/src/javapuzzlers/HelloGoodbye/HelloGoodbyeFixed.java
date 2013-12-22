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
