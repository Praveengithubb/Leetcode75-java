package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestDominoAndTromino {

	@Test
	public void test() {
		DominoAndTromino d = new DominoAndTromino();
		int n = 1;
		int res = d.numTilings(n);
		assertEquals(res, 1);
	}
	@Test
	public void test1() {
		DominoAndTromino d = new DominoAndTromino();
		int n = 3;
		int res = d.numTilings(n);
		assertEquals(res, 5);
	}
}
