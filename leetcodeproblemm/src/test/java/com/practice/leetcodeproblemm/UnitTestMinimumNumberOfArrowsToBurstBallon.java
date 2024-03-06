package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestMinimumNumberOfArrowsToBurstBallon {

	@Test
	public void test() {
		MinimumNumberOfArrowsToBurstBallon arrowsToBurstBallon = new MinimumNumberOfArrowsToBurstBallon();
		int[][] points = {{10,16},{2,8},{1,6},{7,12}};
		int res = arrowsToBurstBallon.findMinArrowShots(points);
		assertEquals(2, res);
	}
	
	@Test
	public void test1() {
		MinimumNumberOfArrowsToBurstBallon arrowsToBurstBallon = new MinimumNumberOfArrowsToBurstBallon();
		int[][] points = {{1,2},{3,4},{5,6},{7,8}};
		int res = arrowsToBurstBallon.findMinArrowShots(points);
		assertEquals(4, res);
	}

}
