package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestMaxNumOfKSumPair {

	@Test
	public void test1() {
		MaxNumberOfKSumPairstestt m=new MaxNumberOfKSumPairstestt();
		int[] nums= {3,1,1,1};
		int k=2;
		int check=m.maxOperations(nums, k);
		assertEquals(1,check);
	}
	@Test
	public void test2() {
		MaxNumberOfKSumPairstestt m=new MaxNumberOfKSumPairstestt();
		int[] nums= {1,2,3,4,5};
		int k=5;
		int check=m.maxOperations(nums, k);
		assertEquals(2,check);
	}
	@Test
	public void test3() {
		MaxNumberOfKSumPairstestt m=new MaxNumberOfKSumPairstestt();
		int[] nums= {3,1,3,4,3};
		int k=6;
		int check=m.maxOperations(nums, k);
		assertEquals(1,check);
	}
}
