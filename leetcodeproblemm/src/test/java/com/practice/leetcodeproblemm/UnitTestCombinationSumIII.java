package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class UnitTestCombinationSumIII {

	@Test
	public void test() {
		CombinationSumIII c = new CombinationSumIII();
		int k = 3;
		int n = 7;
		List<List<Integer>> res = c.combinationSum3(k, n);
		assertEquals(1, res.size());
		assertEquals(List.of(1, 2, 4), res.get(0));
	}

	@Test
	public void test1() {
		CombinationSumIII c = new CombinationSumIII();
		int k = 3;
		int n = 9;
		List<List<Integer>> res = c.combinationSum3(k, n);
		assertEquals(3, res.size());
		assertEquals(List.of(1, 2, 6), res.get(0));
		assertEquals(List.of(1, 3, 5), res.get(1));
		assertEquals(List.of(2, 3, 4), res.get(2));
	}

}
