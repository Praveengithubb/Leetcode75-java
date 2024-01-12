package com.practice.leetcodeproblemm;

public class MaxConsecutiveOnesIII {
	public static int longestOnes(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int zeroCount = 0;
		int max = 0;
		while (right < nums.length) {
			if (nums[right] == 0) {
				zeroCount++;
			}
			while (zeroCount > k) {
				if (nums[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			max = Math.max(right - left + 1, max);
			right++;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		System.out.println(longestOnes(nums, k));
	}
}
