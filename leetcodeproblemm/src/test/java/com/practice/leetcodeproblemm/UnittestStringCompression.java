package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestStringCompression {
	
	@Test
	public void test1() {
		char[] chars= {'a','a'};
		int check=StringCompression.compress(chars);
		assertEquals(2, check);
	}
	@Test
	public void test2() {
		char[] chars= {'a'};
		int check=StringCompression.compress(chars);
		assertEquals(1, check);
	}
	@Test
	public void test3() {
		char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		int check=StringCompression.compress(chars);
		assertEquals(6, check);
	}
}
