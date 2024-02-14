package com.practice.leetcodeproblemm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
	 public static long maxScore(int[] nums1, int[] nums2, int k) {
	      int[][] pair = new int[nums1.length][2];
			for (int i = 0; i < nums1.length; i++) {
				pair[i][0] = nums1[i];
				pair[i][1] = nums2[i];
			}
			Arrays.sort(pair, (a, b) -> b[1] - a[1]);
			 long res = 0, currsum = 0;
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for (int i = 0; i < k - 1; i++) {
				pq.add(pair[i][0]);
				currsum += pair[i][0];
			}
			for (int i = k - 1; i < nums1.length; i++) {
				pq.add(pair[i][0]);
				currsum += pair[i][0];
				res = Math.max(currsum * pair[i][1], res);
				currsum -= pq.peek();
				pq.poll();
	        }
	        return res;
	    }

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 3, 2 };
		int[] nums2 = { 2, 1, 3, 4 };
		int k = 3;
		System.out.println(maxScore(nums1, nums2, k));
	}
}
