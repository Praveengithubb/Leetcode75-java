package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestIsSubsequence {

	@Test
	public void test1() {
		String s="abc";
		String t="ahbgdc";
		boolean check=IsSubsequence.isSubsequence(s, t);
		assertEquals(true, check);
	}
	@Test
	public void test2() {
		String s="acb";
		String t="ahbgdc";
		boolean check=IsSubsequence.isSubsequence(s, t);
		assertEquals(false, check);
	}
	@Test
	public void test3() {
		String s="ece";
		String t="aecdce";
		boolean check=IsSubsequence.isSubsequence(s, t);
		assertEquals(true, check);
	}
}
