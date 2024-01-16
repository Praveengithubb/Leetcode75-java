package com.practice.leetcodeproblemm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurance {
	  public static boolean uniqueOccurrences(int[] arr) {
	        HashMap<Integer,Integer>map=new HashMap<>();
	        for(int i=0;i<arr.length;i++)
	        {
	            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	        }
	        Set<Integer>set=new HashSet<>(map.values());
	        return set.size()==map.size();
	    }
	  public static void main(String[] args) {
		int[] nums= {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(nums));
	}
}
