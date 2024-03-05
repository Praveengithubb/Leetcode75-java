package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestNonOverlappingIntervals {

	@Test
	public void test() {
		NonOverlappingIntervals n = new NonOverlappingIntervals();
		int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
		int res = n.eraseOverlapIntervals(intervals);
		assertEquals(1, res);
	}

	@Test
	public void test1() {
		NonOverlappingIntervals n = new NonOverlappingIntervals();
		int[][] intervals = { { 1, 2 }, { 1,2 }, { 1,2 } };
		int res = n.eraseOverlapIntervals(intervals);
		assertEquals(2, res);
	}

}
