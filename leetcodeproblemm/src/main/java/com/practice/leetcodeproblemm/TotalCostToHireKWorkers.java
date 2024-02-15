package com.practice.leetcodeproblemm;

import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
	public static long totalCost(int[] costs, int k, int candidates) {
		PriorityQueue pq = new PriorityQueue<>();
		PriorityQueue pq1 = new PriorityQueue<>();
		long ans = 0;
		int i = 0;
		int j = costs.length - 1;
		int count = 0;
		while (count < k) {
			while (pq.size() < candidates && i <= j) {
				pq.offer(costs[i++]);
			}
			while (pq1.size() < candidates && j >= i) {
				pq1.offer(costs[j--]);
			}
			int a = pq.size() > 0 ? (int) pq.peek() : Integer.MAX_VALUE;
			int b = pq1.size() > 0 ? (int) pq1.peek() : Integer.MAX_VALUE;
			if (a <= b) {
				ans += a;
				pq.poll();
			} else {
				ans += b;
				pq1.poll();
			}
			count++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] costs = {17,12,10,2,7,2,11,20,8};
		int k = 3;
		int candidates = 4;
		System.out.println(totalCost(costs, k, candidates));
	}
}
