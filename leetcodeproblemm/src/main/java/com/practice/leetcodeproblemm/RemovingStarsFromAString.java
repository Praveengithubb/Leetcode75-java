package com.practice.leetcodeproblemm;

import java.util.Stack;
public class RemovingStarsFromAString {
	public static String remove(String s1) {
		Stack<Character> s = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : s1.toCharArray()) {
			if (c == '*') {
				s.pop();
			} else {
				s.push(c);
			}
		}
		for (char c : s) {
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s1 = "leet**cod*e";
		System.out.println(remove(s1));
	}
}
