package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RoomsAndKeys {
	public static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

	public RoomsAndKeys(int v) {
		for (int i = 0; i < v; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	public void printAdjList() {
		for (int i = 0; i < adjList.size(); i++) {
			for (int j = 0; j < adjList.get(i).size(); j++) {
				System.out.print(adjList.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	public boolean canVisitAllRooms(ArrayList<ArrayList<Integer>> adjList2) {
		int n = adjList2.size();
		boolean[] visited = new boolean[n];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visited[0] = true;
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				int v = queue.poll();
				for (int edge : adjList2.get(v)) {
					System.out.println(edge+"|");
					if (!visited[edge]) {
						visited[edge] = true;
						queue.add(edge);
					}
				}
			}
			System.out.println(9);
		}
		while (--n > 0) {
			if (!visited[n])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		RoomsAndKeys r = new RoomsAndKeys(4);
		r.addEdge(0, 1);
		r.addEdge(1, 2);
		r.addEdge(2, 3);
		r.printAdjList();
		System.out.println(r.canVisitAllRooms(adjList));
	}

}
