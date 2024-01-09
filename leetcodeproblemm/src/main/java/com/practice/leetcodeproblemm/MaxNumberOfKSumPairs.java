package com.practice.leetcodeproblemm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxNumberOfKSumPairs {
	public static int maxOperations(int[] nums, int k) {
		int result = 0;
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			if (nums[start] + nums[end] < k) {
				start++;
			} else if (nums[start] + nums[end] > k) {
				end--;
			} else {
				start++;
				end--;
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 3, 4, 3 };
		int k = 6;
		System.out.println(maxOperations(nums, k));
	}
}
