package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class unittestAsteroidCollision {

	@Test
	public void test() {
		asteroidCollision a = new asteroidCollision();
		int[] asteroids = { -8, 8 };
		int[] expected = { -8, 8 };
		int[] res = a.asteroidCollision(asteroids);
		assertArrayEquals(expected, res);
	}

	@Test
	public void test1() {
		asteroidCollision a = new asteroidCollision();
		int[] asteroids = { 8, -8 };
		int[] expected = {};
		int[] res = a.asteroidCollision(asteroids);
		assertArrayEquals(expected, res);
	}

	@Test
	public void test2() {
		asteroidCollision a = new asteroidCollision();
		int[] asteroids = {10,2,-5 };
		int[] expected = {10};
		int[] res = a.asteroidCollision(asteroids);
		assertArrayEquals(expected, res);
	}

}
