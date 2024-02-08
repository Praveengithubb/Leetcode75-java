package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutesToMakeAllPathLeadToTheCityZero {
	static int dfs(List<List<Integer>> gr, boolean[] visited, int from) {
		int change = 0;
		visited[from] = true;
		for (Integer to : gr.get(from))
			if (!visited[Math.abs(to)])
				change += dfs(gr, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
		return change;
	}

	public static int minReorder(int n, int[][] connections) {
		List<List<Integer>> gr = new ArrayList<>();
		for (int i = 0; i < n; ++i)
			gr.add(new ArrayList<>());
		for (int[] c : connections) {
			gr.get(c[0]).add(c[1]);
			gr.get(c[1]).add(-c[0]);
		}
		return dfs(gr, new boolean[n], 0);
	}

	public static void main(String[] args) {
		int[][] connections = { { 0, 1 }, { 1, 3 }, { 2, 3 }, { 4, 0 }, { 4, 5 } };
		int N = 6;
		int res = minReorder(N, connections);
		System.out.println(res);
	}
}
