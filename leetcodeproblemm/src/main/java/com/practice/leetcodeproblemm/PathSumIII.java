package com.practice.leetcodeproblemm;

import java.util.HashMap;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) {
		val = x;
	}
}

public class PathSumIII {
	public static int count = 0;

	public static int pathSum(TreeNode root, int sum) {
		HashMap<Integer, Integer> preSum = new HashMap();
		preSum.put(0, 1);
		helper(root, 0, sum, preSum);
		return count;
	}

	public static void helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
		if (root == null) {
			return;
		}
		currSum += root.val;
		if (preSum.containsKey(currSum - target)) {
			count += preSum.get(currSum - target);
		}
		if (!preSum.containsKey(currSum)) {
			preSum.put(currSum, 1);
		} else {
			preSum.put(currSum, preSum.get(currSum) + 1);

		}
		helper(root.left, currSum, target, preSum);
		helper(root.right, currSum, target, preSum);
		preSum.put(currSum, preSum.get(currSum) - 1);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.right.right = new TreeNode(11);
		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.left.right.right = new TreeNode(1);

		int result = PathSumIII.pathSum(root, 8);
		System.out.println(result);
	}
}
