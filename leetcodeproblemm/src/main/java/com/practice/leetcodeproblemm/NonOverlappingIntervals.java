package com.practice.leetcodeproblemm;

import java.util.Arrays;

public class NonOverlappingIntervals {
	public static int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
		int previous = 0;
		int n = intervals.length;
		int ans = 0;
		for (int current = 1; current < n; current++) {
			if (intervals[current][0] < intervals[previous][1]) {
				ans++;
				if (intervals[current][1] < intervals[previous][1]) {
					previous = current;
				}
			} else {
				previous = current;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
		System.out.println(eraseOverlapIntervals(intervals));
	}
}
