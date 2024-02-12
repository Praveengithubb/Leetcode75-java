package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestKthLargestElementInAnArray {

	@Test
	public void test() {
		KthLargestElementInAnArray k = new KthLargestElementInAnArray();
		int[] nums = {3,2,1,5,6,4};
		int k1 =2;
		int res = k.findKthLargest(nums, k1);
		assertEquals(5,res);
	}
	@Test
	public void tes1t() {
		KthLargestElementInAnArray k = new KthLargestElementInAnArray();
		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k1 =4;
		int res = k.findKthLargest(nums, k1);
		assertEquals(4,res);
	}
}
