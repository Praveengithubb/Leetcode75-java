package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreeRightSideView {

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		rightview(root, result, 0);
		return result;
	}

	public static void rightview(TreeNode curr, List<Integer> result, int currDepth) {
		if (curr == null) {
			return;
		}
		if (currDepth == result.size()) {
			result.add(curr.val);
		}
		rightview(curr.right, result, currDepth + 1);
		rightview(curr.left, result, currDepth + 1);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);
		List<Integer> result = rightSideView(root);
		for(int r:result)
		{
			System.out.print(r+" ");
		}
	}
}
