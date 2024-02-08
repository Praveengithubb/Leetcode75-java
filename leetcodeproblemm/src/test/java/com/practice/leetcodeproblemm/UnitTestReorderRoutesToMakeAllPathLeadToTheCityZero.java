package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestReorderRoutesToMakeAllPathLeadToTheCityZero {

	@Test
	public void test() {
		ReorderRoutesToMakeAllPathLeadToTheCityZero r = new ReorderRoutesToMakeAllPathLeadToTheCityZero();
		int[][] connections = {{0, 1},{1, 3},{2, 3},{4, 0}, {4, 5}};
		int res = r.minReorder(6, connections);
		assertEquals(3, res);
	}
	
	@Test
	public void test1() {
		ReorderRoutesToMakeAllPathLeadToTheCityZero r = new ReorderRoutesToMakeAllPathLeadToTheCityZero();
		int[][] connections = {{1, 0},{1, 2},{3, 2}, {3, 4}};
		int res = r.minReorder(5, connections);
		assertEquals(2, res);
	}

}
