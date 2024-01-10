package com.practice.leetcodeproblemm;

public class MaximumAverageSubarray {
	public static double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		if (nums.length == 1) {
			return nums[0] / k;
		}
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		double max = sum;
		double ans = sum / k;
		for (int i = k; i < nums.length; i++) {
			sum = sum - nums[i - k] + nums[i];
			if (sum > max) {
				max = sum;
				ans = sum / k;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums= {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(findMaxAverage(nums,k));
	}
}
