package com.practice.leetcodeproblemm;

public class BestTImeToBuyAndSellStockII {
	public static int maxProfit(int[] price,int fee) {
		int buy = Integer.MIN_VALUE;
        int sell = 0;
        for (int prices : price) {
            buy = Math.max(buy, sell - prices);
            sell = Math.max(sell, buy + prices - fee);
        }
        return sell;
	}

	public static void main(String[] args) {
		int[] prices = { 1,3,2,8,4,9 };
		int fee =2;
		System.out.println(maxProfit(prices,fee));
	}
}
