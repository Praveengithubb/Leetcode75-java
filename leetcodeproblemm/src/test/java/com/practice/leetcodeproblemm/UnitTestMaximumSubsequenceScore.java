package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestMaximumSubsequenceScore {

	@Test
	public void test() {
		MaximumSubsequenceScore m = new MaximumSubsequenceScore();
		int[] nums1 = { 1, 3, 3, 2 };
		int[] nums2 = { 2, 1, 3, 4 };
		int k = 3;
		long res = m.maxScore(nums1, nums2, k);
		assertEquals(12, res);
	}
	@Test
	public void test1() {
		MaximumSubsequenceScore m = new MaximumSubsequenceScore();
		int[] nums1 = { 4,2,3,1,1};
		int[] nums2 = {7,5,10,9,6 };
		int k = 1;
		long res = m.maxScore(nums1, nums2, k);
		assertEquals(30, res);
	}
}
