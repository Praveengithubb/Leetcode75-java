package com.practice.leetcodeproblemm;

public class DominoAndTromino {
	public static int numTilings(int n) {

		if (n == 1) return 1;
		else if (n == 2) return 2;
		int[] arr = new int[n + 1];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 5;
		int md = 1000000007;
		for (int i = 4; i <= n; i++) {
			arr[i] = (((2 * arr[i - 1]) % md) + ((arr[i - 3]) % md));
			arr[i] %= md;
		}
		return arr[n];
	}
	public static void main(String[] args) {
		System.out.println(numTilings(3));
	}
}