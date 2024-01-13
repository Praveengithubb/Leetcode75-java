package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestofLongestSubarrayof1sAfterDeletingOneElement {

	@Test
	public void test() {
		LongestSubarrayOf1sAfterDeletingOne l =new LongestSubarrayOf1sAfterDeletingOne();
		int [] nums = {1,1,0,1};
		int res = l.longestSubarray(nums);
		assertEquals(3, res);
	}
	@Test
	public void test1() {
		LongestSubarrayOf1sAfterDeletingOne l =new LongestSubarrayOf1sAfterDeletingOne();
		int [] nums = {0,1,1,1,0,1,1,0,1};
		int res = l.longestSubarray(nums);
		assertEquals(5, res);
	}
	@Test
	public void test2() {
		LongestSubarrayOf1sAfterDeletingOne l =new LongestSubarrayOf1sAfterDeletingOne();
		int [] nums = {1,1,1};
		int res = l.longestSubarray(nums);
		assertEquals(2, res);
	}
}
