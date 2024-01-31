package com.practice.leetcodeproblemm;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class LongestZigZagPathInBinaryTree {
	public static int maxlength = 0;

	public static int longZigZag(TreeNode root) {
		solve(root, 0, 0);
		return maxlength;
	}

	public static void solve(TreeNode root, int dir, int currLen) {
		if (root == null) {
			return;
		}
		maxlength = Math.max(maxlength, currLen);
		solve(root.left, 0, dir == 1 ? currLen + 1 : 1);
		solve(root.right, 1, dir == 1 ? 1 : currLen + 1);
	}

	public static void main(String[] args) {
		 TreeNode root = new TreeNode(1);
	        root.right = new TreeNode(1);
	        root.right.left = new TreeNode(1);
	        root.right.right = new TreeNode(1);
	        root.right.right.left = new TreeNode(1);
	        int result = longZigZag(root);
	        System.out.println(result);
	}
}
