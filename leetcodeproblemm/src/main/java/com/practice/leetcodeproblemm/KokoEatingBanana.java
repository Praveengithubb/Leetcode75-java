package com.practice.leetcodeproblemm;

import java.util.Arrays;

public class KokoEatingBanana {
	public static int minEatingSpeed(int[] piles, int h) {
		Arrays.sort(piles);
		int i = 1;
		int j = piles[piles.length - 1];
		while (i <= j) {
			int mid = (i + j) / 2;
			int totalH = CalculateTotalHours(piles, mid);
			if (totalH < h) {
				j = mid - 1;
			} else if (totalH > h) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		return i;
	}

	public static int CalculateTotalHours(int[] v, int hourly) {
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			sum += Math.ceil((double) (v[i]) / (double) (hourly));
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;
		System.out.println(minEatingSpeed(piles, h));
	}
}
