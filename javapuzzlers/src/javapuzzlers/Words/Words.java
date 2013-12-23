/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Words;

// References to constant fields are resolved at compile time to the constant values they denote [JLS 13.1].
// null is not a compile-time constant expression.
// API designers should think long and hard before exporting a constant field.

//public class Words {
//    private Words() { };  // Uninstantiable
//
//    public static final String FIRST  = "the";
//    public static final String SECOND = null;
//    public static final String THIRD  = "set";
//}

// The second version of the Words class appears below (commented out)

// public class Words {
//     private Words() { };  // Uninstantiable
//
//     public static final String FIRST  = "physics";
//     public static final String SECOND = "chemistry";
//     public static final String THIRD  = "biology";
// }

public class Words {
	private Words() { }; // Uninstantiable

	public static final String FIRST  = ident("the");
	public static final String SECOND = ident(null);
	public static final String THIRD  = ident("set");

	private static String ident(String s) {
		return s;
	}
}
