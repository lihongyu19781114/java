/**
 * JAVATest.java v1.00
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package JAVA;

import static org.junit.Assert.*;

import org.junit.Test;


public class JAVATest {
	// Test Range: [ LOWERBOUND, UPPERBOUND ]
	private final int LOWERBOUND =   0;
	private final int UPPERBOUND = 100;
	private String _FUNC_ = "";
	private int actual_count = 0;
	private int actual_value = 0;
	private int expect_count = 0;
	private int expect_value = 0;

	@Test
	public void testIsOddNumber() {
		_FUNC_ = "JAVA.isOddNumber";
		actual_count = 0;
		actual_value = 0;
		expect_count = UPPERBOUND;
		expect_value = 0;

		for(int ii = -UPPERBOUND; ii <= UPPERBOUND; ii++) {
			if(JAVA.isOddNumber(ii)) {
				actual_count++;
				actual_value += ii;
			}
		}

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testIsEvenNumber() {
		_FUNC_ = "JAVA.isEvenNumber";
		actual_count = 0;
		actual_value = 0;
		expect_count = UPPERBOUND+1;
		expect_value = 0;

		for(int ii = -UPPERBOUND; ii <= UPPERBOUND; ii++) {
			if(JAVA.isEvenNumber(ii)) {
				actual_count++;
				actual_value += ii;
			}
		}

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testIsPrimeNumber() {
		_FUNC_ = "JAVA.isPrimeNumber";
		actual_count = 0;
		actual_value = 0;
		expect_count = 25;
		expect_value = 1060;

		for(int ii = LOWERBOUND; ii <= UPPERBOUND; ii++) {
			if(JAVA.isPrimeNumber(ii)) {
				actual_count++;
				actual_value += ii;
			}
		}

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testIsCompositeNumber() {
		_FUNC_ = "JAVA.isCompositeNumber";
		actual_count = 0;
		actual_value = 0;
		expect_count = 74;
		expect_value = 3989;

		for(int ii = LOWERBOUND; ii <= UPPERBOUND; ii++) {
			if(JAVA.isCompositeNumber(ii)) {
				actual_count++;
				actual_value += ii;
			}
		}

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testCanBeExpressedAsTheSumOfTwoPrimes() {
		_FUNC_ = "JAVA.canBeExpressedAsTheSumOfTwoPrimes";
		actual_count = 0;
		actual_value = 0;
		expect_count = 73;
		expect_value = 3654;

		for(int ii = LOWERBOUND; ii <= UPPERBOUND; ii++) {
			if(JAVA.canBeExpressedAsTheSumOfTwoPrimes(ii)) {
				actual_count++;
				actual_value += ii;
			}
		}

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testGetBit() {
		_FUNC_ = "JAVA.getBit";

		if(JAVA.getBit(12345678, 0) == 1 && JAVA.getBit(12345678, 7) == 8) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testArithmetic() {
		_FUNC_ = "JAVA.arithmetic";

		if(JAVA.arithmetic("2.2+((3+4)*2-22)/2*3.2") == -10.6) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testPrintCurrentTime() {
		_FUNC_ = "JAVA.printCurrentTime";
		System.out.print(_FUNC_ + ":");
		JAVA.printCurrentTime();
	}

	@Test
	public void testSum() {
		_FUNC_ = "JAVA.sum";
		actual_count = 0;
		actual_value = 0;
		expect_count = 0;
		expect_value = 0;

		for(int ii = LOWERBOUND; ii <= UPPERBOUND; ii++) {
			expect_value += ii;
		}

		actual_value = JAVA.sum(
				  0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
				 10,11,12,13,14,15,16,17,18,19,
				 20,21,22,23,24,25,26,27,28,29,
				 30,31,32,33,34,35,36,37,38,39,
				 40,41,42,43,44,45,46,47,48,49,
				 50,51,52,53,54,55,56,57,58,59,
				 60,61,62,63,64,65,66,67,68,69,
				 70,71,72,73,74,75,76,77,78,79,
				 80,81,82,83,84,85,86,87,88,89,
				 90,91,92,93,94,95,96,97,98,99,
				100
				);

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testMin() {
		_FUNC_ = "JAVA.min";
		actual_count = 0;
		actual_value = 0;
		expect_count = 0;
		expect_value = LOWERBOUND;

		actual_value = JAVA.min(
				  0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
				 10,11,12,13,14,15,16,17,18,19,
				 20,21,22,23,24,25,26,27,28,29,
				 30,31,32,33,34,35,36,37,38,39,
				 40,41,42,43,44,45,46,47,48,49,
				 50,51,52,53,54,55,56,57,58,59,
				 60,61,62,63,64,65,66,67,68,69,
				 70,71,72,73,74,75,76,77,78,79,
				 80,81,82,83,84,85,86,87,88,89,
				 90,91,92,93,94,95,96,97,98,99,
				100
				);

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}

	@Test
	public void testMax() {
		_FUNC_ = "JAVA.max";
		actual_count = 0;
		actual_value = 0;
		expect_count = 0;
		expect_value = UPPERBOUND;

		actual_value = JAVA.max(
				  0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
				 10,11,12,13,14,15,16,17,18,19,
				 20,21,22,23,24,25,26,27,28,29,
				 30,31,32,33,34,35,36,37,38,39,
				 40,41,42,43,44,45,46,47,48,49,
				 50,51,52,53,54,55,56,57,58,59,
				 60,61,62,63,64,65,66,67,68,69,
				 70,71,72,73,74,75,76,77,78,79,
				 80,81,82,83,84,85,86,87,88,89,
				 90,91,92,93,94,95,96,97,98,99,
				100
				);

		if(actual_count == expect_count && actual_value == expect_value) {
			System.out.println(_FUNC_ + ":OK");
		} else {
			System.out.println(_FUNC_ + ":NG");
			fail(_FUNC_ + ":NG");
		}
	}
}//public class JAVATest
