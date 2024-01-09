package com.practice.leetcodeproblemm;

import java.util.Arrays;

public class MaxNumberOfKSumPairstestt {
	 public int maxOperations(int[] nums, int k) {
		 int result=0;
		 Arrays.sort(nums);
		 int start=0;
		 int end=nums.length-1;
		 while(start<end)
		 {
			 if(nums[start]+nums[end]<k)
			 {
				 start++;
			 }
			 else if(nums[start]+nums[end]>k)
			 {
				 end--;
			 }
			 else
			 {
				 start++;
				 end--;
				 result++;
			 }
		 }
		return result; 
	 }
}

