package com.practice.leetcodeproblemm;

public class ReverseVowelsOfAString {
	public static String reverseVowels(String s) {
		StringBuilder copy = new StringBuilder(s);
		String vowels = "aeiouAEIOU";
		int l = 0;
		int r = s.length() - 1;
		while (l < r) {
			if (vowels.indexOf(s.charAt(l)) == -1) {
				l++;
			} else if (vowels.indexOf(s.charAt(r)) == -1) {
				r--;
			} else if (vowels.indexOf(s.charAt(l)) != -1 && vowels.indexOf(s.charAt(r)) != -1) {
				char re = s.charAt(l);
				copy.setCharAt(l, s.charAt(r));
				copy.setCharAt(r, re);

				l++;
				r--;
			}
		}
		return copy.toString();
	}

	public static void main(String[] args) {
     String s="hello";
     System.out.println(reverseVowels(s));
	}
}
