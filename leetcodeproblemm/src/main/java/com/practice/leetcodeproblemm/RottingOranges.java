package com.practice.leetcodeproblemm;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	public static int orangesRotting(int[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		Queue<int[]> q = new LinkedList<>();
		int countFreshOrange = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 2) {
					q.offer(new int[] { i, j });
				} else if (grid[i][j] == 1) {
					countFreshOrange++;
				}
			}
		}
		if (countFreshOrange == 0) {
			return 0;
		}
		if (q.isEmpty()) {
			return -1;
		}
		int minutes = -1;
		int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };
		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				int[] cell = q.poll();
				int x = cell[0];
				int y = cell[1];
				for (int[] dir : dirs) {
					int i = x + dir[0];
					int j = y + dir[1];
					if (i >= 0 && i < n && j >= 0 & j < m && grid[i][j] == 1) {
						grid[i][j] = 2;
						q.offer(new int[] { i, j });
						countFreshOrange--;
						}
				}
			}
			minutes++;
		}
		if (countFreshOrange == 0) {
			return minutes;
		}
		return -1;
	}
	public static void main(String[] args) {
		int [][] grid = {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(grid));
	}
}
