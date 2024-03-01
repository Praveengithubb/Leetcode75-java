package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestCountingBits {

	@Test
	public void test() {
		CountingBits bits = new CountingBits();
		int n = 5;
		int [] ans = bits.countBits(n);
		int [] expected = {0,1,1,2,1,2};
		assertArrayEquals(ans, expected);
	}
	@Test
	public void test1() {
		CountingBits bits = new CountingBits();
		int n = 2;
		int [] ans = bits.countBits(n);
		int [] expected = {0,1,1};
		assertArrayEquals(ans, expected);
	}

}
