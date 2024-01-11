package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestMaximumNumberOfVowelsinASubstringOfGivenLength {

	@Test
	public void test1() {
		MaximumNumberOfVowelsinASubstringg m = new MaximumNumberOfVowelsinASubstringg();
		String s = "abciiidef";
		int k = 3;
		int check = m.maxVowels(s, k);
		assertEquals(3, check);
	}

	@Test
	public void test2() {
		MaximumNumberOfVowelsinASubstringg m = new MaximumNumberOfVowelsinASubstringg();
		String s = "aeiou";
		int k = 2;
		int check = m.maxVowels(s, k);
		assertEquals(2, check);
	}

	@Test
	public void test3() {
		MaximumNumberOfVowelsinASubstringg m = new MaximumNumberOfVowelsinASubstringg();
		String s = "leetcode";
		int k = 3;
		int check = m.maxVowels(s, k);
		assertEquals(2, check);
	}
}
