package com.practice.leetcodeproblemm;

public class StringCompression {
	public static int compress(char[] chars) {
		int count = 1;
		int i = 0;
		for (int j = 1; j <= chars.length; j++) {
			if (j == chars.length || chars[j] != chars[j - 1]) {
				chars[i] = chars[j - 1];
				i++;
				if (count >= 2) {
					char[] countarray = Integer.toString(count).toCharArray();
					for (int a = 0; a < countarray.length; a++) {
						chars[i] = countarray[a];
						i++;
					}
				}
				count = 1;
			} else {
				count++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		System.out.println(compress(chars));
	}
}
