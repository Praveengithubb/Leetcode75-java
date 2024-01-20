package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestDecodeString {

	@Test
	public void test() {
		DecodeString d = new DecodeString();
		String s = "3[a]2[bc]";
		String res = d.decodeString(s);
		assertEquals(res, "aaabcbc");
	}
	@Test
	public void test1() {
		DecodeString d = new DecodeString();
		String s = "3[a2[c]]";
		String res = d.decodeString(s);
		assertEquals(res, "accaccacc");
	}
	@Test
	public void test2() {
		DecodeString d = new DecodeString();
		String s = "2[abc]3[cd]ef";
		String res = d.decodeString(s);
		assertEquals(res, "abcabccdcdcdef");
	}
}
