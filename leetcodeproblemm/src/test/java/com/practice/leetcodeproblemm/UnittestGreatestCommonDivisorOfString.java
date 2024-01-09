package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestGreatestCommonDivisorOfString {

	@Test
	public void test1() {
		String str1="ABCABC";
		String str2 = "ABC";
		String check=GreatestCommonDivisorOfString.gcdOfStrings(str1, str2);
		assertEquals("ABC", check);
	}
	@Test
	public void test2() {
		String str1="ABABAB";
		String str2 = "ABAB";
		String check=GreatestCommonDivisorOfString.gcdOfStrings(str1, str2);
		assertEquals("AB", check);
	}
	@Test
	public void test3() {
		String str1="LEET";
		String str2 = "CODE";
		String check=GreatestCommonDivisorOfString.gcdOfStrings(str1, str2);
		assertEquals("", check);
	}
}
