package com.practice.leetcodeproblemm;

public class MergeStringAlternatively {
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder w = new StringBuilder();
		int minlength = word1.length();
		String word = word1;
		if (word2.length() < minlength) {
			minlength = word2.length();
			word = word2;
		}
		for (int i = 0; i < word.length(); i++) {
			w.append(word1.charAt(i));
			w.append(word2.charAt(i));
		}
		if (word1.length() > minlength) {
			int start = word2.length();
			int end = word1.length();
			String add = word1.substring(start, end);
			w.append(add);
		} else if (word2.length() > minlength) {
			int start = word1.length();
			int end = word2.length();
			String add = word2.substring(start, end);
			w.append(add);
		}
		return w.toString();
	}
	public static void main(String[] args) {
		String word1="abc";
		String word2="pqr";
		System.out.println(mergeAlternately(word1, word2));
	}
}
