package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestofUniqueNoOfOccurance {

	@Test
	public void test() {
		UniqueNumberOfOccurance u =new UniqueNumberOfOccurance();
		int [] arr = {1,2,2,1,1,3};
		boolean check = u.uniqueOccurrences(arr);
		assertEquals(check, true);
	}
	@Test
	public void test1() {
		UniqueNumberOfOccurance u =new UniqueNumberOfOccurance();
		int [] arr = {1,2};
		boolean check = u.uniqueOccurrences(arr);
		assertEquals(check, false);
	}
	@Test
	public void test2() {
		UniqueNumberOfOccurance u =new UniqueNumberOfOccurance();
		int [] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		boolean check = u.uniqueOccurrences(arr);
		assertEquals(check, true);
	}
}
