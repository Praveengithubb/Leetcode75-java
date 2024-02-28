package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestBestTImeToBuyAndSellStockII {

	@Test
	public void test() {
		BestTImeToBuyAndSellStockII b = new BestTImeToBuyAndSellStockII();
		int[] prices = { 1,3,2,8,4,9 };
		int fee =2;
		int res = b.maxProfit(prices, fee);
		assertEquals(8, res);
	}
	@Test
	public void test1() {
		BestTImeToBuyAndSellStockII b = new BestTImeToBuyAndSellStockII();
		int[] prices = { 1,3,7,5,10,3};
		int fee = 3;
		int res = b.maxProfit(prices, fee);
		assertEquals(6, res);
	}

}
