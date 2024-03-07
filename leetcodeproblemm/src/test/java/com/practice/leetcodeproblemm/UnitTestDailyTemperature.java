package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestDailyTemperature {

	@Test
	public void test() {
		DailyTemperatures d = new DailyTemperatures();
		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] res = d.dailyTemperatures(temperatures);
		int[] exp = { 1, 1, 4, 2, 1, 1, 0, 0 };
		assertArrayEquals(exp, res);
	}
	@Test
	public void test1() {
		DailyTemperatures d = new DailyTemperatures();
		int[] temperatures = { 30,40,50,60 };
		int[] res = d.dailyTemperatures(temperatures);
		int[] exp = { 1,1,1,0};
		assertArrayEquals(exp, res);
	}

}
