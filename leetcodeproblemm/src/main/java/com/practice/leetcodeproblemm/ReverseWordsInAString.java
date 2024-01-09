package com.practice.leetcodeproblemm;

public class ReverseWordsInAString {
	public static String reverseWords(String s) {
		s = s.trim().replaceAll("\\s+", " ");
		String[] splited = s.split(" ");
		StringBuilder reversed = new StringBuilder();
		for (int i = splited.length - 1; i >= 0; i--) {
			reversed.append(splited[i]).append(" ");
		}
		return reversed.toString().trim();
	}

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
}
