/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.LongDivision;

public class LongDivisionFixed {
	public static void main(String[] args) {
		// When working with large numbers, watch out for overflow—it's a silent killer.
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}
}
