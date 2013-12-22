package javapuzzlers.Oddity;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddityFixedTest {

	@Test
	public void testIsOdd() {
		for(int ii = LOWERBOUND; ii <= UPPERBOUND; ii++) {
			if(OddityFixed.isOdd(ii)) {
				actual_count++;
				actual_value += ii;
			}
		}
		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK@["+LOWERBOUND+","+UPPERBOUND+"]");
		} else {
			System.out.println(_FUNC_ + ":NG@["+LOWERBOUND+","+UPPERBOUND+"]");
			fail(_FUNC_ + ":NG");
		}

		test_case = -2;
		if(!OddityFixed.isOdd(test_case)) {
			System.out.println(_FUNC_ + ":OK@["+test_case+"]");
		} else {
			System.out.println(_FUNC_ + ":NG@["+test_case+"]");
			fail(_FUNC_ + ":NG");
		}

		test_case = -1;
		if(OddityFixed.isOdd(test_case)) {
			System.out.println(_FUNC_ + ":OK@["+test_case+"]");
		} else {
			System.out.println(_FUNC_ + ":NG@["+test_case+"]");
			fail(_FUNC_ + ":NG");
		}
	}

	private final java.lang.String _FUNC_ = "OddityImproved.isOdd";
	private final int LOWERBOUND = -100;
	private final int UPPERBOUND =  100;
	private int actual_count = 0;
	private int actual_value = 0;
	private int expect_count = 100;
	private int expect_value = 0;
	private int test_case = 0;
}