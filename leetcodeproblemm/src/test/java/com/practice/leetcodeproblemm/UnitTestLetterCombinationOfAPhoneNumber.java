package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UnitTestLetterCombinationOfAPhoneNumber {

	@Test
	public void test() {
		LetterCombinationOfAPhoneNumber l = new LetterCombinationOfAPhoneNumber();
		String digit = "23";
		List<String>exp = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
		List<String> res = l.letterCombinations(digit);
		assertEquals(exp, res);
	}
	@Test
	public void test1() {
		LetterCombinationOfAPhoneNumber l = new LetterCombinationOfAPhoneNumber();
		String digit = "2";
		List<String>exp = Arrays.asList("a", "b", "c");
		List<String> res = l.letterCombinations(digit);
		assertEquals(exp, res);
	}
}
