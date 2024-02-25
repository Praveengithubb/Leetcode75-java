package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestHouseRobber {

	@Test
	public void test() {
		HouseRobber r = new HouseRobber();
		int[] nums = { 1, 2, 3, 1 };
		int res = r.rob(nums);
		assertEquals(4, res);
	}
	@Test
	public void test1() {
		HouseRobber r = new HouseRobber();
		int[] nums = { 2,7,9,3,1};
		int res = r.rob(nums);
		assertEquals(12, res);
	}
}
