package com.practice.leetcodeproblemm;

public class IncreasingTripletSequence {
	public static boolean checkTripletSequence(int[] nums) {
		if (nums == null || nums.length < 3) {
			return false;
		}
			int a = Integer.MAX_VALUE;
			int b = Integer.MAX_VALUE;
			for (int num : nums) {
				if (num <= a) {
					a = num;
				} else if (num <= b) {
					b = num;
				} else {
					return true;
				}
			}
		
		return false;
	}

	public static void main(String[] args) {
     int[] nums= {1,2,3,4,5};
     System.out.println(checkTripletSequence(nums));
	}
}
