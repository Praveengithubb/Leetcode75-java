package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestDetermineIfTwoStringsAreClose {

	@Test
	public void test() {
		DetermineIfTwoStringsAreClose d =new DetermineIfTwoStringsAreClose();
		String word1 = "cab";
		String word2 = "bca";
		boolean check = d.check(word1, word2);
		assertEquals(check, true);
	}
	@Test
	public void test1() {
		DetermineIfTwoStringsAreClose d =new DetermineIfTwoStringsAreClose();
		String word1 = "a";
		String word2 = "aa";
		boolean check = d.check(word1, word2);
		assertEquals(check, false);
	}
	@Test
	public void test2() {
		DetermineIfTwoStringsAreClose d =new DetermineIfTwoStringsAreClose();
		String word1 = "cabbba";
		String word2 = "abbccc";
		boolean check = d.check(word1, word2);
		assertEquals(check, true);
	}
}
