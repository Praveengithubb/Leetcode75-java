package com.practice.leetcodeproblemm;

public class CanPlaceFlowers {
	public static boolean canPlaceFlowers(int[] arr, int n) {
		for(int i=0;i<arr.length&&n>0;i++)
		{
			if(arr[i]==0&&(i==0||arr[i-1]==0)&&(i==arr.length-1||arr[i+1]==0))
			{
				arr[i]=1;
				n--;
			}
		}
		return n==0;
    }
public static void main(String[] args) {
	int[] nums= {1,0,0,0,1};
	int n=1;
	System.out.println(canPlaceFlowers(nums, n));
}
}
