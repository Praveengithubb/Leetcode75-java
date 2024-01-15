package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UnittestOfFindTheDifferenceOfTwoArrays {

	@Test
	public void test() {
		FindTheDifferenceOfTwoArray f = new FindTheDifferenceOfTwoArray();
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };
		List<List<Integer>> check = f.findDifference(nums1, nums2);
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(1, 3));
		expected.add(Arrays.asList(4, 6)); 
		assertEquals(expected, check);

	}
	@Test
	public void test1() {
		FindTheDifferenceOfTwoArray f = new FindTheDifferenceOfTwoArray();
		int[] nums1 = { 1,2,3,3 };
		int[] nums2 = {1,1,2,2};
		List<List<Integer>> check = f.findDifference(nums1, nums2);
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList( )); 
		assertEquals(expected, check);

	}

}
