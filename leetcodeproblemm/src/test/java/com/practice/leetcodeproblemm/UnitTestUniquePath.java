package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestUniquePath {

	@Test
	public void test() {
		UniquePaths u = new UniquePaths();
		int m = 3;
		int n = 7;
		int res = u.uniquePaths(m, n);
		assertEquals(28, res);
	}

	@Test
	public void test1() {
		UniquePaths u = new UniquePaths();
		int m = 3;
		int n = 2;
		int res = u.uniquePaths(m, n);
		assertEquals(3, res);
	}
}
