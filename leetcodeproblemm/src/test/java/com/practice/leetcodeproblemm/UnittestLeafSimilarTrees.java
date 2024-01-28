package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestLeafSimilarTrees {

	@Test
	public void test() {
		LeafSimilarTrees tree = new LeafSimilarTrees(10);
		tree.insertleft(tree.root, 5);
		tree.insertright(tree.root, 15);
		tree.insertleft(tree.root.left, 3);
		tree.insertright(tree.root.left, 8);
		tree.insertleft(tree.root.right, 12);
		LeafSimilarTrees tree1 = new LeafSimilarTrees(1);
		tree1.insertleft(tree1.root, 50);
		tree1.insertright(tree1.root, 5);
		tree1.insertleft(tree1.root.left, 3);
		tree1.insertright(tree1.root.left, 8);
		tree1.insertleft(tree1.root.right, 12);
		assertEquals(true, LeafSimilarTrees.leafSimilar(tree.root, tree1.root));
	}

	@Test
	public void test1() {
		LeafSimilarTrees tree = new LeafSimilarTrees(10);
		tree.insertleft(tree.root, 5);
		tree.insertright(tree.root, 15);
		LeafSimilarTrees tree1 = new LeafSimilarTrees(1);
		tree1.insertleft(tree1.root, 15);
		tree1.insertright(tree1.root, 5);
		assertEquals(false, LeafSimilarTrees.leafSimilar(tree.root, tree1.root));
	}

}
