package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestSwapTwoNumbers {

	@Test
	public void test() {
		Swap2numbers s =new Swap2numbers();
		int a = 0;
		int b = 1;
		int []  check = {1,0};
		assertArrayEquals(check, s.testswap(a,b));
	}
	@Test
	public void test1() {
		Swap2numbers s =new Swap2numbers();
		int a = 1;
		int b = 0;
		int []  check = {0,1};
		assertArrayEquals(check, s.testswap(a,b));
	}
	@Test
	public void test2() {
		Swap2numbers s =new Swap2numbers();
		int a = 10;
		int b = 11;
		int []  check = {11,10};
		assertArrayEquals(check, s.testswap(a,b));
	}
}
