package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestCountGoodNodesInABinaryTree {

	@Test
	public void test1() {
		CountGoodNodesInBinaryTree tree = new CountGoodNodesInBinaryTree(3);
		tree.insertleft(tree.root, 1);
        tree.insertright(tree.root, 4);
        tree.insertleft(tree.root.left, 3);
        tree.insertright(tree.root.left, 5);
        tree.insertright(tree.root.right, 1);
		assertEquals(4, tree.goodNode(tree.root));
	}
	@Test
	public void test2()
	 {
		CountGoodNodesInBinaryTree tree = new CountGoodNodesInBinaryTree(3);
		assertEquals(1, tree.goodNode(tree.root));
		
	}
}
