package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestGuessNumberHigherOrLower {
	@Test
	public void test() {
		GuessNumberHigherOrLower g = new GuessNumberHigherOrLower();
		int n = 100;
		int res = g.guessNumber(n);
		assertEquals(72, res);
	}
}
