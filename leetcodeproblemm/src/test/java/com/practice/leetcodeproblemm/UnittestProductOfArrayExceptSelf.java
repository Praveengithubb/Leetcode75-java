package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestProductOfArrayExceptSelf {

	@Test
	public void test1() {
		int[] nums= {1,2,3,4};
		int[] num=ProductOfArrayExceptSelf.productExceptSelf(nums);
		int[] check= {24,12,8,6};
        assertArrayEquals(check, num);
	}
	@Test
	public void test2() {
		int[] nums= {-1,1,0,-3,3};
		int[] num=ProductOfArrayExceptSelf.productExceptSelf(nums);
		int[] check= {0,0,9,0,0};
        assertArrayEquals(check, num);
	}
	@Test
	public void test3() {
		int[] nums= {-1, -2, -3, -4};
		int[] num=ProductOfArrayExceptSelf.productExceptSelf(nums);
		int[] check= {-24, -12, -8, -6};
        assertArrayEquals(check, num);
	}
}
