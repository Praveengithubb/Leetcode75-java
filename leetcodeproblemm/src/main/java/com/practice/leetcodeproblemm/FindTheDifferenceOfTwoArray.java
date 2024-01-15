package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArray {
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> result = new ArrayList<>();
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}
		List<Integer> difference1 = new ArrayList<>(set1);
		List<Integer> difference2 = new ArrayList<>(set2);

		difference1.removeAll(set2);
		difference2.removeAll(set1);

		result.add(difference1);
		result.add(difference2);

		return result;
    }
public static void main(String[] args) {
	int[] nums1 = {1,2,3};
	int[] nums2 = {2,4,6};
	System.out.println(findDifference(nums1,nums2));
}
}
