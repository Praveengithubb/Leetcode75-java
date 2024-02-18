package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestFindPeakElement {

	@Test
	public void test() {
		FindPeakElement f = new FindPeakElement();
		int[] nums = { 1, 2, 3, 1 };
		int res = f.findPeakElement(nums);
		assertEquals(2, res);
	}

	@Test
	public void test1() {
		FindPeakElement f = new FindPeakElement();
		int[] nums = { 1 };
		int res = f.findPeakElement(nums);
		assertEquals(0, res);
	}
}
