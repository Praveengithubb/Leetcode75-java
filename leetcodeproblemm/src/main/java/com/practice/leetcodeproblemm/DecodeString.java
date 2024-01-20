package com.practice.leetcodeproblemm;

import java.util.Stack;

public class DecodeString {
	public static String decodeString(String s) {
		Stack<String> stack = new Stack<String>();
		int currentNo = 0;
		StringBuilder currentString = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				currentNo = currentNo * 10 + Character.getNumericValue(c);
			} else if (c == '[') {
				stack.push(currentString.toString());
				stack.push(String.valueOf(currentNo));
				currentString = new StringBuilder();
				currentNo = 0;
			} else if (c == ']') {
				int previousNo = Integer.parseInt(stack.pop());
				String previousString = stack.pop();
				currentString = new StringBuilder(previousString + currentString.toString().repeat(previousNo));
			} else {
				currentString.append(c);
			}
		}
		return currentString.toString();
	}

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
}
