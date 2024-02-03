package com.practice.leetcodeproblemm;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class MaximumLevelSumOFABinaryTree {
	public static int maxLevelSum(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		int level = 0;
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		while (!que.isEmpty()) {
			int sum = 0;
			cnt++;
			int n = que.size();
			for (; n > 0; n--) {
				TreeNode cur = que.remove();
				sum += cur.val;
				if (cur.left != null)
					que.add(cur.left);
				if (cur.right != null)
					que.add(cur.right);
			}
			if (sum > max) {
				max = sum;
				level = cnt;
			}
		}
		return level;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(7);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(-2);
		System.out.println(maxLevelSum(root));

	}
}
