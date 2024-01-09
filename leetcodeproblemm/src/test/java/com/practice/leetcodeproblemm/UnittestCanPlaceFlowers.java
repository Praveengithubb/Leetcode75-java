package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestCanPlaceFlowers {

	@Test
	public void test1() {
		int[] nums = { 1, 0, 1 };
		int n = 0;
		boolean check = CanPlaceFlowers.canPlaceFlowers(nums, n);
		assertEquals(true, check);
	}

	@Test
	public void test2() {
		int[] nums = { 0, 0, 1 };
		int n = 0;
		boolean check = CanPlaceFlowers.canPlaceFlowers(nums, n);
		assertEquals(true, check);
	}

	@Test
	public void test3() {
		int[] nums = { 1, 1, 0 };
		int n = 0;
		boolean check = CanPlaceFlowers.canPlaceFlowers(nums, n);
		assertEquals(true, check);
	}

	@Test
	public void test4() {
		int[] nums = { 0, 0, 1, 0, 0 };
		int n = 0;
		boolean check = CanPlaceFlowers.canPlaceFlowers(nums, n);
		assertEquals(true, check);
	}
}
