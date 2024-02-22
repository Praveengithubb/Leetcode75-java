package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestNthTribonacciNumber {

	@Test
	public void test() {
		NthTribonacciNumber n1 = new NthTribonacciNumber();
		int n = 4;
		int res = n1.tribonacci(n);
		assertEquals(4, res);
	}
	@Test
	public void test1() {
		NthTribonacciNumber n1 = new NthTribonacciNumber();
		int n = 25;
		int res = n1.tribonacci(n);
		assertEquals(1389537, res);
	}
}
