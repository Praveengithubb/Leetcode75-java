package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestMaximumDepthOfBinaryTree {

	@Test
	public void test() {
		MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree(10);
		tree.insertleft(tree.root, 5);
		tree.insertright(tree.root, 15);
		tree.insertleft(tree.root.left, 3);
		tree.insertright(tree.root.left, 8);
		tree.insertleft(tree.root.right, 12);
		assertEquals(3, tree.maxDepth(tree.root));
	}

	@Test
	public void test1() {
		MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree(1);
		tree.insertright(tree.root, 3);
		assertEquals(2, tree.maxDepth(tree.root));

	}
}
