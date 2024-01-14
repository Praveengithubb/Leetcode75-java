package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestFindTheHighestAltitude {

	@Test
	public void test() {
		FindTheHighestAltitude f =new FindTheHighestAltitude();
		int [] gain = {-5,1,5,0,-7};
		int check = f.largestAltitude(gain);
		assertEquals(1, check);
	}
	@Test
	public void test1() {
		FindTheHighestAltitude f =new FindTheHighestAltitude();
		int [] gain = {-4,-3,-2,-1,4,3,2};
		int check = f.largestAltitude(gain);
		assertEquals(0, check);
	}

}
