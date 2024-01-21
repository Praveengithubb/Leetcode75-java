package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
	Queue<Integer> q = new LinkedList<>();

	public int ping(int t) {
		q.add(t);
		while (!q.isEmpty() && q.peek() < t - 3000) {
			q.poll();
		}
		return q.size();
	}
		public static ArrayList<Integer>recentCounter(String[] commands, int[][] parameter)
		{
			ArrayList<Integer>a=new ArrayList<Integer>();
			RecentCounter recentCounter = null;
			for (int i = 0; i < commands.length; i++) {
				switch (commands[i]) {
				case "RecentCounter":
					recentCounter = new RecentCounter();
					a.add(null);
					break;
				case "ping":
					if (recentCounter != null) {
						int result = recentCounter.ping(parameter[i][0]);
						a.add(result);
					}
					break;
				}
			}
			return a;
		}
	public static void main(String[] args) {
		
		String[] commands = { "RecentCounter", "ping", "ping", "ping", "ping" };
		int[][] parameters = { {}, { 1 }, { 100 }, { 3001 }, { 3002 } };
		ArrayList<Integer> a=recentCounter(commands, parameters);
		for(Integer a1: a)
		{
			System.out.print(a1+" ");
		}
	}
}
