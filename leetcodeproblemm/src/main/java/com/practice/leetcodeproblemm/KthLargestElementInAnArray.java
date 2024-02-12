package com.practice.leetcodeproblemm;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minpq = new PriorityQueue<>();
		for (int i = 0; i < nums.length; i++) {
			if (minpq.size() < k) {
				minpq.offer(nums[i]);
			} else {
				if (minpq.peek() < nums[i]) {
					minpq.poll();
					minpq.offer(nums[i]);
				}
			}
		}
		return minpq.peek();
	}
	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int k =2;
		System.out.println(findKthLargest(nums, k));
	}
}
