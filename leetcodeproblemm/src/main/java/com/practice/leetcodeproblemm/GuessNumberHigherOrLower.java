package com.practice.leetcodeproblemm;

public class GuessNumberHigherOrLower {
	public static int guessNumber(int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (guess(mid) == 0) {
				return mid;
			} else if (guess(mid) == 1) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}

		}
		return low;
	}

	public static int guess(int guessedNumber) {
		int target = 72;
		if (guessedNumber == target) {
			return 0;
		} else if (guessedNumber > target) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		GuessNumberHigherOrLower g = new GuessNumberHigherOrLower();
		int n = 100;
		System.out.println(g.guessNumber(n));
	}
}
