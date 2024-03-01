package com.practice.leetcodeproblemm;

public class CountingBits {
	public static int[] countBits(int n) {
		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				dp[i] = dp[i / 2];
			} else {
				dp[i] = dp[i / 2] + 1;
			}
		}
		return dp;
	}

	public static void main(String[] args) {
		int[] ans = countBits(5);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}
}
