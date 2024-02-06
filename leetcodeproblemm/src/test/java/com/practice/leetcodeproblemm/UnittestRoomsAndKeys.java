package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestRoomsAndKeys {

	@Test
	public void test() {
		RoomsAndKeys r = new RoomsAndKeys(4);
		r.addEdge(0, 1);
		r.addEdge(1, 2);
		r.addEdge(2, 3);
		assertEquals(true, r.canVisitAllRooms(r.adjList));
	}
	@Test
	public void test1() {
		RoomsAndKeys r = new RoomsAndKeys(4);
		r.addEdge(0, 1);
		r.addEdge(1, 2);
		r.addEdge(2, 3);
		r.addEdge(4, 7);
		assertEquals(false, r.canVisitAllRooms(r.adjList));
	}

}
