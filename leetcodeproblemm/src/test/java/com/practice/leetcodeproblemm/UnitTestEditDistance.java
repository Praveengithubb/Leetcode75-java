package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestEditDistance {

	@Test
	public void test() {
		EditDistance e = new EditDistance();
		String s = "horse";
		String s1 = "ros";
		int res = e.minDistance(s, s1);
		assertEquals(3, res);
	}
	@Test
	public void test1() {
		EditDistance e = new EditDistance();
		String s = "intention";
		String s1 = "execution";
		int res = e.minDistance(s, s1);
		assertEquals(5, res);
	}
}
