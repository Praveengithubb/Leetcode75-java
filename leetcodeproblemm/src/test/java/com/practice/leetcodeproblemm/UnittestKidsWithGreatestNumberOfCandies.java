package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UnittestKidsWithGreatestNumberOfCandies {

	@Test
	public void test1() {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extracandies = 3;
		List<Boolean> check = KidsWithGreatestNoOfCandies.kidsWithCandies(candies, extracandies);
		List<Boolean> expected = new ArrayList<Boolean>();
		expected.add(true);
		expected.add(true);
		expected.add(true);
		expected.add(false);
		expected.add(true);
		assertEquals(expected, check);
	}

	@Test
	public void test2() {
		int[] candies = { 12, 1, 12 };
		int extracandies = 10;
		List<Boolean> check = KidsWithGreatestNoOfCandies.kidsWithCandies(candies, extracandies);
		List<Boolean> expected = new ArrayList<Boolean>();
		expected.add(true);
		expected.add(false);
		expected.add(true);
		assertEquals(expected, check);
	}
	@Test
	public void test3() {
		int[] candies = { 4,2,1,1,2};
		int extracandies = 1;
		List<Boolean> check = KidsWithGreatestNoOfCandies.kidsWithCandies(candies, extracandies);
		List<Boolean> expected = new ArrayList<Boolean>();
		expected.add(true);
		expected.add(false);
		expected.add(false);
		expected.add(false);
		expected.add(false);
		assertEquals(expected, check);
	}
}
