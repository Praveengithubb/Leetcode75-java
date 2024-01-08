package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.leetcodeproblems.ContainerwithmostWatertestt;

public class UnittestContainerWithMostWater {

	@Test
	public void test() {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerwithmostWatertestt c = new ContainerwithmostWatertestt();
		int check = c.maxArea(height);
		assertEquals(49, check);
	}
	@Test
	public void test1() {
		int[] height = { 1,1};
		ContainerwithmostWatertestt c = new ContainerwithmostWatertestt();
		int check = c.maxArea(height);
		assertEquals(1, check);
	}
	@Test
	public void test2() {
		int[] height = { 8, 6, 2, 5, 4, 8 };
		ContainerwithmostWatertestt c = new ContainerwithmostWatertestt();
		int check = c.maxArea(height);
		assertEquals(40, check);
	}

}
