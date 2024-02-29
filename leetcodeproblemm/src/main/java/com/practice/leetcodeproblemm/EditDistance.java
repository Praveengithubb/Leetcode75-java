package com.practice.leetcodeproblemm;

import java.util.Arrays;

public class EditDistance {
	public static int minDistance(String word1, String word2) {

		int[][] dp = new int[word1.length()][word2.length()];
		for (int[] rows : dp) {
			Arrays.fill(rows, -1);
		}
		return minDistance(0, 0, word1, word2, dp);
	}

	public static int minDistance(int ind1, int ind2, String word1, String word2, int[][] dp) {
		if (ind1 > word1.length() - 1) {
			return word2.length() - ind2;
		}
		if (ind2 > word2.length() - 1) {
			return word1.length() - ind1;
		}
		if (dp[ind1][ind2] != -1) {
			return dp[ind1][ind2];
		}
		if (word1.charAt(ind1) == word2.charAt(ind2)) {
			return dp[ind1][ind2] = minDistance(ind1 + 1, ind2 + 1, word1, word2, dp);
		} else {

			int a = 1 + minDistance(ind1 + 1, ind2, word1, word2, dp);
			int b = 1 + minDistance(ind1 + 1, ind2 + 1, word1, word2, dp);
			int c = 1 + minDistance(ind1, ind2 + 1, word1, word2, dp);
			return dp[ind1][ind2] = Math.min(a, Math.min(b, c));
		}
	}
	public static void main(String[] args) {
		System.out.println(minDistance("horse", "ros"));
	}
}
