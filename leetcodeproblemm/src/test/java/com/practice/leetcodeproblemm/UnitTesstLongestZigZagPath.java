package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTesstLongestZigZagPath {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.right.left = new TreeNode(1);
        int result = LongestZigZagPathInBinaryTree.longZigZag(root);
        assertEquals(2, result);
	}
	@Test
	public void test1() {
		TreeNode root = new TreeNode(1);
        int result = LongestZigZagPathInBinaryTree.longZigZag(root);
        assertEquals(0, result);
	}
}
