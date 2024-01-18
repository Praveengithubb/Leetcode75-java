package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestRemovingStarFromAString {

	@Test
	public void test() {
		RemovingStarsFromAString r =new RemovingStarsFromAString();
		String s1= "leet**cod*e";
		String check = r.remove(s1);
		assertEquals("lecoe", check);
	}
	@Test
	public void test1() {
		RemovingStarsFromAString r =new RemovingStarsFromAString();
		String s1= "erase*****";
		String check = r.remove(s1);
		assertEquals("", check);
	}
}
