package com.practice.leetcodeproblemm;

public class FindTheHighestAltitude {
	 public static int largestAltitude(int[] gain) {
	       int  res = 0;
	        int max = 0;
	        for(int i = 0;i<gain.length;i++)
	        {
	            res+=gain[i];
	            max=Math.max(max,res);
	        }
	        return max;
	    }
public static void main(String[] args) {
	int [] gain = {-5,1,5,0,-7};
	System.out.println(largestAltitude(gain));
}
}
