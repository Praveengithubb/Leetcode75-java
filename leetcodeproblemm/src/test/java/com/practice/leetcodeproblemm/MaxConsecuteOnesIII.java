package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxConsecuteOnesIII {

	@Test
	public void test1() {
		int k=2;
		int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
		int check=MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(6,check);
	}
	@Test
	public void test2() {
		int k=3;
		int[] nums= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,};
		int check=MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(10,check);
	}
	@Test
	public void test3() {
		int k=2;
		int[] nums= {0,0,1,1,0,0,1};
		int check=MaxConsecutiveOnesIII.longestOnes(nums, k);
		assertEquals(5,check);
	}
}
