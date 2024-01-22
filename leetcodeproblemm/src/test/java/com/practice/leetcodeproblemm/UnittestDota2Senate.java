package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestDota2Senate {

	@Test
	public void test() {
		Dota2Senate d =new Dota2Senate();
		String senate="RD";
		String res = d.predictPartyVictory(senate);
		assertEquals("Radiant", res);
	}
	@Test
	public void test1() {
		Dota2Senate d =new Dota2Senate();
		String senate="RDD";
		String res = d.predictPartyVictory(senate);
		assertEquals("Dire", res);
	}
	@Test
	public void test2() {
		Dota2Senate d =new Dota2Senate();
		String senate="RDDDRDRRDR";
		String res = d.predictPartyVictory(senate);
		assertEquals("Dire", res);
	}
}
