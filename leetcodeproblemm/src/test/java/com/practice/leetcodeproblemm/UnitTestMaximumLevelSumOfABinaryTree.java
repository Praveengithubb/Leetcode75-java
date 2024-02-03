package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestMaximumLevelSumOfABinaryTree {

	@Test
	public void test() {
		MaximumLevelSumOFABinaryTree m = new MaximumLevelSumOFABinaryTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(7);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(-2);
		int res = m.maxLevelSum(root);
		assertEquals(res, 2);
		
	}
	@Test
	public void test1() {
		MaximumLevelSumOFABinaryTree m = new MaximumLevelSumOFABinaryTree();
		TreeNode root = new TreeNode(1);
		int res = m.maxLevelSum(root);
		assertEquals(res, 1);
		
	}

}
