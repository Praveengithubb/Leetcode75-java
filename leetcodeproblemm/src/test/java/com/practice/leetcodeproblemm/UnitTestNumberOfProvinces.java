package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestNumberOfProvinces {

	@Test
	public void test() {
		NumberOfProvinces n = new NumberOfProvinces();
		int[][] arr = {{1,1,0},{1,1,0},{0,0,1}};
		int res = n.findCircleNum(arr);
		assertEquals(res, 2);
	}
	@Test
	public void test1() {
		NumberOfProvinces n = new NumberOfProvinces();
		int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
		int res = n.findCircleNum(arr);
		assertEquals(res, 3);
	}

}
