package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> combinations = new ArrayList<>();
		backtracking(combinations, new ArrayList<>(), k, n, 1);
		return combinations;
	}

	private static void backtracking(List<List<Integer>> result, List<Integer> current, int k, int n, int start) {

		if (current.size() == k && n == 0) {
			result.add(new ArrayList<>(current));
			return;
		}

		for (int i = start; i <= 9; i++) {
			current.add(i);
			backtracking(result, current, k, n - i, i + 1);
			current.remove(current.size() - 1);
		}
	}

	public static void main(String[] args) {
		int k = 3;
		int n = 7;
		System.out.println(combinationSum3(k, n));
	}
}
