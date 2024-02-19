package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestKokoEatingBanana {

	@Test
	public void test() {
		KokoEatingBanana k = new KokoEatingBanana();
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;
		int res = k.minEatingSpeed(piles, h);
		assertEquals(4, res);
	}
	
	@Test
	public void test1() {
		KokoEatingBanana k = new KokoEatingBanana();
		int[] piles = { 30,11,23,4,20 };
		int h = 5;
		int res = k.minEatingSpeed(piles, h);
		assertEquals(30, res);
	}

}
