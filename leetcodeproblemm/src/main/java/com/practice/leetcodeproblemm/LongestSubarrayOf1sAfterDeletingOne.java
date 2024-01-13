package com.practice.leetcodeproblemm;

public class LongestSubarrayOf1sAfterDeletingOne {
	public static int longestSubarray(int[] nums) {
		int zeroCount = 0;
		int right = 0;
		int left = 0;
		int max = 0;
		while (right < nums.length) {
			if (nums[right] == 0) {
				zeroCount++;
			}
			while (zeroCount > 1) {
				if (nums[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			max = Math.max(max, right - left - zeroCount + 1);
			right++;
		}
		if (zeroCount != 0) {
			return max;
		} else {
			return nums.length - 1;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1,1,0,1};
		System.out.println(longestSubarray(nums));
	}
}
