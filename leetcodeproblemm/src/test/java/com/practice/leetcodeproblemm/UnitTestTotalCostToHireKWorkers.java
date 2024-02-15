package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestTotalCostToHireKWorkers {

	@Test
	public void test() {
		TotalCostToHireKWorkers c = new TotalCostToHireKWorkers();
		int[] costs = {17,12,10,2,7,2,11,20,8};
		int k = 3;
		int candidates = 4;
		long res = c.totalCost(costs, k, candidates);
		assertEquals(11, res);
	}
	@Test
	public void test1() {
		TotalCostToHireKWorkers c = new TotalCostToHireKWorkers();
		int[] costs = {1,2,4,1};
		int k = 3;
		int candidates = 3;
		long res = c.totalCost(costs, k, candidates);
		assertEquals(4, res);
	}

}
