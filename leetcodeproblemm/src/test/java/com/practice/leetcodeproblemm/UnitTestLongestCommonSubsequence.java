package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestLongestCommonSubsequence {

	@Test
	public void test() {
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		String s1="abcde";
		String s2="ace";
		int res = l.longestCommonSubsequence(s1, s2);
		assertEquals(3, res);
	}
	@Test
	public void test1() {
		LongestCommonSubsequence l = new LongestCommonSubsequence();
		String s1="abc";
		String s2="abc";
		int res = l.longestCommonSubsequence(s1, s2);
		assertEquals(3, res);
	}
}
