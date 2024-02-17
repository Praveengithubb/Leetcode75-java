package com.practice.leetcodeproblemm;

import java.util.Arrays;

public class SuccessfullPairsOfSpellsAndPotions {
	public static int validpos(int[] portions, long success, int spells) {
		long position = (success + spells - 1) / spells;
		int l = 0;
		int r = portions.length;
		while (l < r) {
			int mid = (l + r) / 2;
			if (portions[mid] >= position) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}

	public static int[] successfulPairs(int[] spells, int[] potions, long success) {
		Arrays.sort(potions);
		int[] res = new int[spells.length];
		for (int i = 0; i < spells.length; i++) {
			res[i] = potions.length - validpos(potions, success, spells[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] spells = {5,1,3};
		int[] potions = {1,2,3,4,5};
		int success = 7;
		int [] res = successfulPairs(spells, potions, success);
		for(int i:res)
		{
			System.out.println(i);
		}
	}
}
