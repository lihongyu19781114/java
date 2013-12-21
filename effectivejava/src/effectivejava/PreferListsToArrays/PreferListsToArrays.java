package effectivejava.PreferListsToArrays;

//import java.util.*;

public final class PreferListsToArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Fails at runtime!
		Object[] objectArray = new Long[1];
		objectArray[0] = "I don't fit in"; // Throws ArrayStoreException

		// Won't compile!
		//List<Object> ol = new ArrayList<Long>(); // Incompatible types
		//ol.add("I don't fit in");
	}//public static void main(String[] args)

}//public final class PreferListsToArrays
