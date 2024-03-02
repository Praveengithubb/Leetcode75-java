package com.practice.leetcodeproblemm;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int ans = nums[0];
		int i = 1;
		while (i < nums.length) {
			ans = ans ^ nums[i];
			i++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };
		System.out.println(singleNumber(nums));
	}
}
