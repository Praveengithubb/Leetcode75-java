package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestReverseWordsInAString {

	@Test
		public void test() {
			String s="  Hello        world   ";
			String check=ReverseWordsInAString.reverseWords(s);
			assertEquals("world Hello", check);
	}
	@Test
	public void test1() {
		String s="a good     example";
		String check=ReverseWordsInAString.reverseWords(s);
		assertEquals("example good a", check);
	}
		@Test
		public void test2() {
			String s="  Leetcode";
			String check=ReverseWordsInAString.reverseWords(s);
			assertEquals("Leetcode", check);
}
}
