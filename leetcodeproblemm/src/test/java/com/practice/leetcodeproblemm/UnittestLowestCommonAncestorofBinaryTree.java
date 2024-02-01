package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestLowestCommonAncestorofBinaryTree {

	@Test
	public void test() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		TreeNode p = root.left;
		TreeNode q = root.right.right;
		TreeNode result = LowestCommonAncestorOfABinarytree.lowestCommonAncestor(root, p, q);
		assertEquals(3, root.val);
	}
	@Test
	public void test1()
	{
		TreeNode root = new TreeNode(3);
	    root.left = new TreeNode(5);
	    root.right = new TreeNode(1);
	    root.left.left = new TreeNode(6);
	    root.left.right = new TreeNode(2);
	    root.right.left = new TreeNode(0);
	    root.right.right = new TreeNode(8);
	    root.left.right.left = new TreeNode(7);
	    root.left.right.right = new TreeNode(4);
	    TreeNode p = root;
	    TreeNode q = root.right ;
		TreeNode result = LowestCommonAncestorOfABinarytree.lowestCommonAncestor(root, p, q);
		assertEquals(3, root.val);
	}
}
