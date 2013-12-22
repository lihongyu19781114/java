package javapuzzlers.LongDivision;

public class LongDivisionFixed {
	public static void main(String[] args) {
		// When working with large numbers, watch out for overflow—it's a silent killer.
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}
}
