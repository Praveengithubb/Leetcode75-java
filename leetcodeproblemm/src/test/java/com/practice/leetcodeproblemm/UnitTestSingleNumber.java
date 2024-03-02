package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestSingleNumber {

	@Test
	public void test() {
		SingleNumber s = new  SingleNumber();
		int[] nums = {2,2,1};
		int res = s.singleNumber(nums);
		assertEquals(1, res);
	}
	@Test
	public void test1() {
		SingleNumber s = new  SingleNumber();
		int[] nums = {1};
		int res = s.singleNumber(nums);
		assertEquals(1, res);
	}

}
