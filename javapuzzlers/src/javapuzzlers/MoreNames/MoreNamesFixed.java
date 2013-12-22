package javapuzzlers.MoreNames;

import java.util.HashMap;
import java.util.Map;

public class MoreNamesFixed {
	private Map<String,String> m = new HashMap<String,String>();

	// Don't accidentally turn a constructor declaration into a method declaration
	// by adding a return type.
	// obey the standard naming conventions

	// There are several other approaches to eliminating this trap.
	// One is to prohibit method names that are the same as their class name, as does C#.
	// Another is to dispense with constructors altogether, as does Smalltalk.
	public /*void*/ MoreNamesFixed() {
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
	}

	public int size() {
		return m.size();
	}

	public static void main(String args[]) {
		MoreNamesFixed moreNames = new MoreNamesFixed();
		System.out.println(moreNames.size());
	}
}
