package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestReverseVowelsOfAString {

	@Test
	public void test1() {
		String s="hello";
		String check=ReverseVowelsOfAString.reverseVowels(s);
		assertEquals("holle", check);
	}
	@Test
	public void test2() {
		String s="abcd";
		String check=ReverseVowelsOfAString.reverseVowels(s);
		assertEquals("abcd", check);
	}
	@Test
	public void test3() {
		String s="leetcode";
		String check=ReverseVowelsOfAString.reverseVowels(s);
		assertEquals("leotcede", check);
	}
}

