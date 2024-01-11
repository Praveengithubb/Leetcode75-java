package com.practice.leetcodeproblemm;

public class MaximumNumberOfVowelsinASubstring {
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static int maxVowels(String s, int k) {
		int count = 0;
		int start = 0;
		int max = 0;
		for (int end = 0; end < s.length(); end++) {
			if (isVowel(s.charAt(end))) {
				count++;
			}
			if (end >= k) {
				if (isVowel(s.charAt(start))) {
					count--;
				}
				start++;
			}
			max = Math.max(max, count);
		}
		return max;
	}

	public static void main(String[] args) {
		String s = "abciiidef";
		int k = 3;
		System.out.println(maxVowels(s, k));
	}
}
