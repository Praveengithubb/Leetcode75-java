package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UnitTestEvaluateDivision {

	@Test
	public void test() {
		EvaluateDivision d = new EvaluateDivision();
		List<List<String>> equations = new ArrayList<List<String>>();
		equations.add(new ArrayList<>(List.of("a", "b")));
		equations.add(new ArrayList<>(List.of("b", "c")));
		List<List<String>> queries = new ArrayList<List<String>>();
		queries.add(new ArrayList<>(List.of("a", "c")));
		queries.add(new ArrayList<>(List.of("b", "a")));
		queries.add(new ArrayList<>(List.of("a", "e")));
		queries.add(new ArrayList<>(List.of("a", "a")));
		queries.add(new ArrayList<>(List.of("x", "x")));
		double[] values = { 2.0, 3.0 };
		double[] res = d.calcEquation(equations, values, queries);
		assertEquals(res[0], 6.0, 0.001);
		assertEquals(res[1], 0.5, 0.001);
		assertEquals(res[2], -1.0, 0.001);
		assertEquals(res[3], 1.0, 0.001);
		assertEquals(res[4], -1.0, 0.001);
	}

	@Test
	public void test1() {
		EvaluateDivision d = new EvaluateDivision();
		List<List<String>> equations = new ArrayList<List<String>>();
		equations.add(new ArrayList<>(List.of("a", "b")));
		equations.add(new ArrayList<>(List.of("b", "c")));
		equations.add(new ArrayList<>(List.of("bc", "cd")));
		List<List<String>> queries = new ArrayList<List<String>>();
		queries.add(new ArrayList<>(List.of("a", "c")));
		queries.add(new ArrayList<>(List.of("c", "b")));
		queries.add(new ArrayList<>(List.of("bc", "cd")));
		queries.add(new ArrayList<>(List.of("cd", "bc")));
		double[] values = { 1.5, 2.5, 5.0 };
		double[] res = d.calcEquation(equations, values, queries);
		assertEquals(res[0], 3.75000, 0.001);
		assertEquals(res[1], 0.40000, 0.001);
		assertEquals(res[2], 5.00000, 0.001);
		assertEquals(res[3], 0.20000, 0.001);
	}

}
