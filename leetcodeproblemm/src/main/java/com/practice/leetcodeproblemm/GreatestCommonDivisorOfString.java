package com.practice.leetcodeproblemm;

public class GreatestCommonDivisorOfString {
	public static String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int gcd = gcd(str1.length(), str2.length());
		{
			return str2.substring(0, gcd);
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		String str1 = "ABABAB";
		String str2 = "ABAB";
		System.out.println(gcdOfStrings(str1, str2));
	}
}
