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
