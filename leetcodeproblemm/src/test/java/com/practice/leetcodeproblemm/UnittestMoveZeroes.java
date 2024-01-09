package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestMoveZeroes {

	@Test
	public void test1() {
		int[] nums= {0,1,0,3,12};
		int[]check=MoveZeroes.moveZeroes(nums);
		int[] expected= {1,3,12,0,0};
		assertArrayEquals(expected, check);
	}

	@Test
	public void test2() {
		int[] nums= {0};
		int[]check=MoveZeroes.moveZeroes(nums);
		int[] expected= {0};
		assertArrayEquals(expected, check);
	}
	
	@Test
	public void test3() {
		int[] nums= {0,0,1};
		int[]check=MoveZeroes.moveZeroes(nums);
		int[] expected= {1,0,0};
		assertArrayEquals(expected, check);
	}
}
