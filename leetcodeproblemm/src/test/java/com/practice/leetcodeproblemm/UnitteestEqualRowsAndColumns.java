package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitteestEqualRowsAndColumns {

	@Test
	public void test() {
		EqualRowAndColumnPairs e = new EqualRowAndColumnPairs();
		int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
		int check = e.equalPairs(grid);
		assertEquals(check, 1);
	}

	@Test
	public void test1() {
		EqualRowAndColumnPairs e = new EqualRowAndColumnPairs();
		int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
		int check = e.equalPairs(grid);
		assertEquals(check, 3);
	}

	@Test
	public void test2() {
		EqualRowAndColumnPairs e = new EqualRowAndColumnPairs();
		int[][] grid = { { 13, 13 }, { 13, 13 }, };
		int check = e.equalPairs(grid);
		assertEquals(check, 4);
	}
}
