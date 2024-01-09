package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestIncreasingTripletSequence {

	@Test
	public void test1() {
		int[] nums = { 1, 2, 3, 4, 5 };
		boolean check = IncreasingTripletSequence.checkTripletSequence(nums);
		assertEquals(true, check);
	}

	@Test
	public void test2() {
		int[] nums = { 5, 4, 3, 2, 1 };
		boolean check = IncreasingTripletSequence.checkTripletSequence(nums);
		assertEquals(false, check);
	}

	@Test
	public void test3() {
		int[] nums = { 1 };
		boolean check = IncreasingTripletSequence.checkTripletSequence(nums);
		assertEquals(false, check);
	}

	@Test
	public void test4() {
		int[] nums = { 2, 1, 5, 0, 4, 6 };
		boolean check = IncreasingTripletSequence.checkTripletSequence(nums);
		assertEquals(true, check);
	}
}
