package effectivejava.UseEnumsInsteadOfIntConstants;

public final class UseEnumsInsteadOfIntConstants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double earthWeight = 175.0;//Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()) {
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}
}
