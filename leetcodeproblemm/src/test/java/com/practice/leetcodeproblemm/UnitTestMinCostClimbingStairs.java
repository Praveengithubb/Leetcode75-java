package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestMinCostClimbingStairs {

	@Test
	public void test() {
		MinCostClimbingStairs m = new MinCostClimbingStairs();
		int[] cost = { 10, 15, 20 };
		int res = m.minCostClimbingStairs(cost);
		assertEquals(15, res);
	}

	@Test
	public void test1() {
		MinCostClimbingStairs m = new MinCostClimbingStairs();
		int[] cost = { 1, 1, 3, 2 };
		int res = m.minCostClimbingStairs(cost);
		assertEquals(3, res);
	}

}
