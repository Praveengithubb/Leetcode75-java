package com.practice.leetcodeproblemm;

public class MoveZeroes {
	public static int[] moveZeroes(int[] nums) {
		int j = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				j = i;
				break;
			}
		}
		if (j != -1) {
			for (int i = j + 1; i < nums.length; i++) {
				if (nums[i] != 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					j++;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] num = { 0, 1, 0, 3, 12 };
		int[] nums = moveZeroes(num);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
