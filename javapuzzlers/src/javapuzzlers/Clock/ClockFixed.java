package javapuzzlers.Clock;

public class ClockFixed {
	// Replace all magic numbers with appropriately named constants
	// never use spacing to express grouping; use parentheses.
    private static final int MS_PER_HOUR   = 60 * 60 * 1000;
    private static final int MS_PER_MINUTE = 60 * 1000;

	public static void main(String[] args) {
		int minutes = 0;
		for (int ms = 0; ms < MS_PER_HOUR; ms++)
			if (ms % MS_PER_MINUTE == 0)
				minutes++;
		System.out.println(minutes);
	}

}
