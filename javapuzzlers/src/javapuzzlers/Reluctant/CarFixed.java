/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Reluctant;

//Fixed - instance initializers don't throw checked exceptions
public class CarFixed {
	@SuppressWarnings("rawtypes")
	private static Class engineClass;

	@SuppressWarnings("unused")
	private Engine engine = newEngine();

	private static Engine newEngine() {

		try {

			return (Engine) engineClass.newInstance();

		} catch (IllegalAccessException e) {

			throw new AssertionError(e);

		} catch (InstantiationException e) {

			throw new AssertionError(e);

		}

	}

	public CarFixed() { }
}

class Engine {

}
