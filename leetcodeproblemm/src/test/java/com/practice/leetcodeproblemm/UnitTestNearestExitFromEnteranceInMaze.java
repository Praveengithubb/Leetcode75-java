package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestNearestExitFromEnteranceInMaze {

	@Test
	public void test() {
		NearestExistFromEntranceInMaze n = new NearestExistFromEntranceInMaze();
		char[][] maze = {{'+','.','+'},{'+','.','.'},{'+','.','+'}};
		int[] entrance = {0,1};
		int res = n.nearestExit(maze, entrance);
		assertEquals(2, res);
	}
	@Test
	public void test1() {
		NearestExistFromEntranceInMaze n = new NearestExistFromEntranceInMaze();
		char[][] maze = {{'+','.','+'},{'+','+','.'},{'+','.','+'}};
		int[] entrance = {0,1};
		int res = n.nearestExit(maze, entrance);
		assertEquals(-1, res);
	}
	@Test
	public void test2() {
		NearestExistFromEntranceInMaze n = new NearestExistFromEntranceInMaze();
		char[][] maze = {{'+','.','+'},{'.','.','.'},{'+','.','+'}};
		int[] entrance = {1,0};
		int res = n.nearestExit(maze, entrance);
		assertEquals(2, res);
	}
}
