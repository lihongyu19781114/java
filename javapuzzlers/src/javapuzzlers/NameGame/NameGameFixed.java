/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.NameGame;

import java.util.IdentityHashMap;
import java.util.Map;

public class NameGameFixed {
	// Don't use IdentityHashMap unless you need its identity-based semantics;
	// it is not a general-purpose Map implementation.
	public static void main(String args[]) {
		Map<String, String> m = new IdentityHashMap<String, String>();
		m.put("Mickey Mouse", "");
		m.put("Mickey Mantle", "");
		System.out.println(m.size());
	}
}
