package com.practice.leetcodeproblemm;

import java.util.Stack;

public class asteroidCollision {
	public static int[] asteroidCollision(int[] asteroids) {
		int n = asteroids.length - 1;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < asteroids.length; i++) {
			if (asteroids[i] > 0 || s.isEmpty()) {
				s.push(asteroids[i]);
			} else {
				while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[i])) {
					s.pop();
				}
				if (!s.isEmpty() && s.peek() == Math.abs(asteroids[i])) {
					s.pop();
				} else {
					if (s.isEmpty() || s.peek() < 0) {
						s.push(asteroids[i]);
					}
				}
			}
		}
		int[] res = new int[s.size()];
		for (int i = s.size() - 1; i >= 0; i--) {
			res[i] = s.pop();
		}
		return res;

	}

	public static void main(String[] args) {
		int[] asteroids = { -2, 2 };
		int[] res = asteroidCollision(asteroids);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
