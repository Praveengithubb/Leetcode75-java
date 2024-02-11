package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestRottingOrange {

	@Test
	public void test() {
		RottingOranges r = new RottingOranges();
		int [][] grid = {{2,1,1},{0,1,1},{1,0,1}};
		int res = r.orangesRotting(grid);
		assertEquals(-1, res);
	}
	@Test
	public void test1() {
		RottingOranges r = new RottingOranges();
		int [][] grid = {{0,2}};
		int res = r.orangesRotting(grid);
		assertEquals(0, res);
	}
	@Test
	public void test2() {
		RottingOranges r = new RottingOranges();
		int [][] grid = {{2,1,1},{1,1,1},{0,1,2}};
		int res = r.orangesRotting(grid);
		assertEquals(2, res);
	}

}
