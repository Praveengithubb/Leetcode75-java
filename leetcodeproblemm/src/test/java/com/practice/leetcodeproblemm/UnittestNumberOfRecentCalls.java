package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UnittestNumberOfRecentCalls {

	@Test
	public void test() {
		RecentCounter r =new RecentCounter();
		String[] commands = { "RecentCounter", "ping", "ping", "ping", "ping" };
		int[][] parameters = { {}, { 1 }, { 100 }, { 3001 }, { 3002 } };
		ArrayList<Integer> res = r.recentCounter(commands, parameters);
		ArrayList<Integer> expected = new ArrayList<>();
        expected.add(null);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, res);
	}
	@Test
	public void test1() {
		RecentCounter r =new RecentCounter();
		String[] commands = {"RecentCounter", "ping", "ping", "ping", "ping", "ping"};
	    int[][] parameters = {{}, {1}, {100}, {3001}, {3002}, {4000}};
		ArrayList<Integer> res = r.recentCounter(commands, parameters);
		ArrayList<Integer> expected = new ArrayList<>();
        expected.add(null);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, res);
	}
	@Test
	public void test2() {
		RecentCounter r =new RecentCounter();
		String[] commands = {"RecentCounter", "ping", "ping", "ping", "ping", "ping", "ping"};
		int[][] parameters = {{}, {1}, {100}, {3001}, {3002}, {4000}, {5000}};
		ArrayList<Integer> res = r.recentCounter(commands, parameters);
		ArrayList<Integer> expected = new ArrayList<>();
        expected.add(null);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, res);
	}

}
