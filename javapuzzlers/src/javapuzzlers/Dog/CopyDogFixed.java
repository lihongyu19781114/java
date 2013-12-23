/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Dog;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// a singleton class that implements Serializable must have a readResolve method that returns its sole instance.

public class CopyDogFixed {
	public static void main(String[] args) {
		Dog newDog = (Dog) deepCopy(Dog.INSTANCE); // You figure out what to put here

		// This line should print false
		System.out.println(newDog == Dog.INSTANCE);

		// This line should print "Woof"
		System.out.println(newDog);
	}

	// This method is very slow and generally a bad idea!
	static public Object deepCopy(Object obj) {
		try {
			ByteArrayOutputStream bos =
				new ByteArrayOutputStream();
			new ObjectOutputStream(bos).writeObject(obj);
			ByteArrayInputStream bin =
				new ByteArrayInputStream(bos.toByteArray());
			return new ObjectInputStream(bin).readObject();
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

}
