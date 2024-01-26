package com.practice.leetcodeproblemm;

import java.util.Scanner;

public class Swap2numbers {
	public static void find(int a, int b) {
		if (a == 0) {
			a = b;
			b = 0;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.exit(0);
		}
		if (b == 0) {
			b = a;
			a = 0;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.exit(0);
		} else {
			a = b * a;
			b = a / b;
			a = a / b;
			System.out.println(a);
			System.out.println(b);
		}
	}

	public static int[] testswap(int a, int b) {
		int[] arr = new int[2];
		if (a == 0) {
			a = b;
			b = 0;
			arr[0] = a;
			arr[1] = b;
			return arr;
		}
		if (b == 0) {
			b = a;
			a = 0;
			arr[0] = a;
			arr[1] = b;
			return arr;
		} else {
			a = b * a;
			b = a / b;
			a = a / b;
			arr[0] = a;
			arr[1] = b;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a  number");
		int a = scn.nextInt();
		System.out.println("enter a  number");
		int b = scn.nextInt();
		find(a, b);
	}
}
