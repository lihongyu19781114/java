/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.SerialKiller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// If a HashSet, Hashtable, or HashMap will be serialized, ensure that its contents do not refer back to it, directly or indirectly.
// By contents, we mean elements, keys, and values.
// In readObject or readResolve methods, avoid invoking methods directly or indirectly on objects currently being deserialized.

public class SerialKillerFixed {
	public static void main(String[] args) {
		SubFixed sub = new SubFixed(666);
		sub.checkInvariant();

		SubFixed copy = (SubFixed) deepCopy(sub);
		copy.checkInvariant();
	}

	// Copies its argument via serialization (See Puzzle 80)
	static public Object deepCopy(Object obj) {
		try {
			ByteArrayOutputStream bos =
				new ByteArrayOutputStream();
			new ObjectOutputStream(bos).writeObject(obj);
			ByteArrayInputStream bin =
				new ByteArrayInputStream(bos.toByteArray());
			return new ObjectInputStream(bin).readObject();
		} catch(Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
}

class SuperFixed implements Serializable {
	final Set<SuperFixed> set = new HashSet<SuperFixed>();
}

final class SubFixed extends SuperFixed {
	private int id;
	public SubFixed(int id) {
		this.id = id;
		set.add(this); // Establish invariant
	}

	public void checkInvariant() {
		if (!set.contains(this))
			throw new AssertionError("invariant violated");
	}

	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		return (o instanceof SubFixed) && (id == ((SubFixed)o).id);
	}
}
