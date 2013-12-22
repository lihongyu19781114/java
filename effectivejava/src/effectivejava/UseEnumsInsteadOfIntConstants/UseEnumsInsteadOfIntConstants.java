/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

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
