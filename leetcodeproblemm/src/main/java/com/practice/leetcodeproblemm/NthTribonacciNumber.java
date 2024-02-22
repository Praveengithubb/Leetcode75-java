package com.practice.leetcodeproblemm;

public class NthTribonacciNumber {
	public static int tribonacci(int n) {
		int s1 = 0;
		int s2 = 1;
		int s3 = 1;
		if (n == 0) {
			return s1;
		}
		if (n == 1) {
			return s2;
		}
		if (n == 2) {
			return s3;
		}
		int a = 3;
		int ans = 0;
		while (a <= n) {
			ans = s1 + s2 + s3;
			s1 = s2;
			s2 = s3;
			s3 = ans;
			a++;
		}
		return ans;
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(tribonacci(n));
		
	}
}
