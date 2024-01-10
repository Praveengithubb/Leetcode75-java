package com.practice.leetcodeproblemm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnittestMaximumAverageSubarray {

	@Test
	public void test1() {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double check = MaximumAverageSubarray.findMaxAverage(nums, k);
		assertEquals(12.75, check, 0.001);
	}
	@Test
	public void test2() {
		int[] nums = { 5 };
		int k = 1;
		double check = MaximumAverageSubarray.findMaxAverage(nums, k);
		assertEquals(5, check, 0.001);
	}
}
