/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.UnwelcomeGuest;
public class UnwelcomeGuest {
	// A blank final field can be assigned only at points in the program where it is definitely unassigned.
	// there are some provably safe programs that the compiler must reject.
	// If you must refactor a program to eliminate a compilation error caused by the definite assignment rules, consider adding a new method.
    public static final long GUEST_USER_ID = -1;

//    private static final long USER_ID;
//    static {
//        try {
//            USER_ID = getUserIdFromEnvironment();
//        } catch (IdUnavailableException e) {
//            USER_ID = GUEST_USER_ID;
//            System.out.println("Logging in as guest");
//        }
//    }
    private static final long USER_ID = getUserIdOrGuest();
    private static long getUserIdOrGuest() {
    	try {
    		return getUserIdFromEnvironment();

    	} catch (IdUnavailableException e) {
    		System.out.println("Logging in as guest");
    		return GUEST_USER_ID;
    	}
    }


    private static long getUserIdFromEnvironment()
            throws IdUnavailableException {
        throw new IdUnavailableException(); // Simulate an error
    }

    public static void main(String[] args) {
        System.out.println("User ID: " + USER_ID);
    }
}

class IdUnavailableException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
}
