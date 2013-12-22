package javapuzzlers.library;

/**
 * This class may contain any desired code.  It must contain a commented-out
 * private declaration that causes the client (client.Client) to fail
 * to compile when uncommented. No prohibition is placed on what classes
 * or interfaces Api may extend or implement.
 */
public final class Api {
	// Reusing names is dangerous; avoid hiding, shadowing, and obscuring.
//	private static class String {}
	public static String newString() {
		return new String();
	}
}
