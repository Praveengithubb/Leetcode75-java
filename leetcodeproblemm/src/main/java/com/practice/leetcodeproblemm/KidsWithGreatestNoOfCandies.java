package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean> result = new ArrayList<>();
	        int high=candies[0];
	        for(int i=0;i<candies.length;i++)
	        {
	        if(candies[i]>high)
	        {
	          high=candies[i];
	        }
	        }
	        for(int i=0;i<candies.length;i++)
	        {
	            int sum=candies[i]+extraCandies;
	            if(sum>=high)
	            {
	                result.add(true);
	            }
	            else
	            {
	                result.add(false);
	            }
	        }
	        return result;
	    }
public static void main(String[] args) {
	int[] candies= {2,3,5,1,3};
	int extracandies=3;
	System.out.println(kidsWithCandies(candies, extracandies));
}
}
