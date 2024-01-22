package com.practice.leetcodeproblemm;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
	public static String predictPartyVictory(String senate) {
		Queue<Integer> rad = new LinkedList<Integer>();
		Queue<Integer> dir = new LinkedList<Integer>();
		int n = senate.length();
		for (int i = 0; i < n; i++) {
			if (senate.charAt(i) == 'R') {
				rad.add(i);
			} else {
				dir.add(i);
			}
		}
		while (!rad.isEmpty() && !dir.isEmpty()) {
			if (rad.peek() < dir.peek()) {
				rad.add(n++);
			} else {
				dir.add(n++);
			}
			rad.poll();
			dir.poll();
		}
		return (rad.isEmpty()) ? ("Dire") : ("Radiant");
	}

	public static void main(String[] args) {
		String senate="RD";
		System.out.println(predictPartyVictory(senate));
	}
}
