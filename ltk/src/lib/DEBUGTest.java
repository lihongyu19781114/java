package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class DEBUGTest {

	@Test
	public void testClassName() {
		if("lib.DEBUGTest".equals(DEBUG.ClassName())) {
			System.out.println(DEBUG.MethodName() + ":OK");
		} else {
			fail(DEBUG.MethodName() + ":NG");
		}
	}

	@Test
	public void testMethodName() {
		if("testMethodName".equals(DEBUG.MethodName())) {
			System.out.println(DEBUG.MethodName() + ":OK");
		} else {
			fail(DEBUG.MethodName() + ":NG");
		}
	}

	@Test
	public void testFileName() {
		if("DEBUGTest.java".equals(DEBUG.FileName())) {
			System.out.println(DEBUG.MethodName() + ":OK");
		} else {
			fail(DEBUG.MethodName() + ":NG");
		}
	}

	@Test
	public void testLineNumber() {
		final int LINENUMBER = 39; // You should check LINENUMBER's value when you modify this source.
		if(LINENUMBER == (DEBUG.LineNumber())) {
			System.out.println(DEBUG.MethodName() + ":OK");
		} else {
			fail(DEBUG.MethodName() + ":NG");
		}
	}

	@Test
	public void testDateTime() {
		System.out.println(DEBUG.DateTime() + ":OK");
	}
}
