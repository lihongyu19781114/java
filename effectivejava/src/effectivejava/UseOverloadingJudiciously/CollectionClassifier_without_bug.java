/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.UseOverloadingJudiciously;

import java.math.BigInteger;
import java.util.*;

public final class CollectionClassifier_without_bug {
	public static String classify(Set<?> s) {
		return "Set";
	}
	public static String classify(List<?> lst) {
		return "List";
	}
	public static String classify(Collection<?> c) {
		return "Unknown Collection";
	}
	public static void main(String[] args) {
//		Collection<?>[] collections = {
//				new HashSet<String>(),
//				new ArrayList<BigInteger>(),
//				new HashMap<String, String>().values()
//		};
//		for (Collection<?> c : collections)
//			System.out.println(classify(c));
		HashSet<?>   hashset   = new HashSet<String>();
		ArrayList<?> arraylist = new ArrayList<BigInteger>();
		HashMap<?,?> hashmap   = new HashMap<String, String>();

		System.out.println(classify(hashset));
		System.out.println(classify(arraylist));
		System.out.println(classify(hashmap.values()));
	}
}
