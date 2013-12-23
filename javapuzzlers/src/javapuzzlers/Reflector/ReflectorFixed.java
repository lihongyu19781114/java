/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Reflector;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReflectorFixed {
	// You cannot legally access a member of a nonpublic type from another package [JLS 6.6.1].
	// Although common, the idiom object.getClass().getMethod("methodName") is broken and should not be used.
	// When accessing a type reflectively, use a Class object that represents an accessible type.
	// You can avoid this whole category of problem if you use reflection only for instantiation and use interfaces to invoke methods [EJ Item 35].
	public static void main(String[] args) throws Exception {
		Set<String> s = new HashSet<String>();
		s.add("foo");
		Iterator it = s.iterator();
//		Method m = it.getClass().getMethod("hasNext");
		Method m = Iterator.class.getMethod("hasNext");
		System.out.println(m.invoke(it));
	}
}
