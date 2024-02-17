package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestSuccessfullPairsOfSpellsAndPotions {

	@Test
	public void test() {
		SuccessfullPairsOfSpellsAndPotions s = new SuccessfullPairsOfSpellsAndPotions();
		int[] spells = { 5, 1, 3 };
		int[] potions = { 1, 2, 3, 4, 5 };
		int success = 7;
		int[] res = s.successfulPairs(spells, potions, success);
		int[] expected = { 4, 0, 3 };
		assertArrayEquals(expected, res);
	}

	@Test
	public void test1() {
		SuccessfullPairsOfSpellsAndPotions s = new SuccessfullPairsOfSpellsAndPotions();
		int[] spells = { 3, 1, 2 };
		int[] potions = { 8, 5, 8 };
		int success = 16;
		int[] res = s.successfulPairs(spells, potions, success);
		int[] expected = { 2, 0, 2 };
		assertArrayEquals(expected, res);
	}
}
