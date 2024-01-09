package com.practice.leetcodeproblemm;

public class ProductOfArrayExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
		int[] res = new int[nums.length];
		int left = 1;
		int right = 1;
		for (int i = 0; i < nums.length; i++) {
			res[i] = left;
			left = left * nums[i];
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			res[i] = res[i] * right;
			right = right * nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[] num= productExceptSelf(nums);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
}
