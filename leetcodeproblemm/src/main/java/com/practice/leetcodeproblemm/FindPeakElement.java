package com.practice.leetcodeproblemm;

public class FindPeakElement {
	public static int findPeakElement(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int index = 0;
		while (i < j) {
			if (arr[i] < arr[j]) {
				index = j;
				i++;
			} else if (arr[i] > arr[j]) {
				index = i;
				j--;
			} else {
				i++;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(findPeakElement(nums));
	}
}
