package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestMergeStringsAlternatively {

	@Test
	public void test1() {
		String word1="abc";
		String word2="pqr";
		String check=MergeStringAlternatively.mergeAlternately(word1, word2);
		assertEquals("apbqcr",check);
	}
	
	@Test
	public void test2() {
		String word1="ab";
		String word2="pqrs";
		String check=MergeStringAlternatively.mergeAlternately(word1, word2);
		assertEquals("apbqrs",check);
	}
	
	@Test
	public void test3() {
		String word1="abcd";
		String word2="pq";
		String check=MergeStringAlternatively.mergeAlternately(word1, word2);
		assertEquals("apbqcd",check);
	}
}
