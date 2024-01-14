package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestFindPivotIndex {

	@Test
	public void test() {
		int[] nums = {1,7,3,6,5,6};
		FindPivotIndex f =new FindPivotIndex();
		int check=f.pivotIndex(nums);
		assertEquals(3, check);
	}
	@Test
	public void test1() {
		int[] nums = {1,2,3};
		FindPivotIndex f =new FindPivotIndex();
		int check=f.pivotIndex(nums);
		assertEquals(-1, check);
	}
	@Test
	public void test2() {
		int[] nums = {2,1,-1};
		FindPivotIndex f =new FindPivotIndex();
		int check=f.pivotIndex(nums);
		assertEquals(0, check);
	}
}
