package com.practice.leetcodeproblemm;


public class ContainerwithmostWatertestt {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int prod = 1;
		int res = 0;
		while (left < right) {
			if (height[left] < height[right]) {
				prod = height[left] * (right - left);
				if (prod > res) {
					res = prod;
				}
				left++;
			} else {
				prod = height[right] * (right - left);
				if (prod > res) {
					res = prod;
				}
				right--;
			}
		}
		return res;
	}
}
