package com.practice.leetcodeproblemm;

import java.util.Stack;

public class StockSpanner {
	static class Pair {
		int x;
		int span;

		Pair(int x, int span) {
			this.x = x;
			this.span = span;
		}
	}

	private Stack<Pair> stack;

	public StockSpanner() {
		stack = new Stack<>();
	}

	public int next(int price) {
		int span = 1;
		while (!stack.isEmpty() && stack.peek().x <= price) {
			Pair p = stack.pop();
			span = span + p.span;
		}
		stack.push(new Pair(price, span));
		return span;
	}

	public static void main(String[] args) {
		StockSpanner spanner = new StockSpanner();
		System.out.println(spanner.next(100));
		System.out.println(spanner.next(80));
		System.out.println(spanner.next(60));
		System.out.println(spanner.next(70));
		System.out.println(spanner.next(60));
		System.out.println(spanner.next(75));
		System.out.println(spanner.next(85));
	}
}
