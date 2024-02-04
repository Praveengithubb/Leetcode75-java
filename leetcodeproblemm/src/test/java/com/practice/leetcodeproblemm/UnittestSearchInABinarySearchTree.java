package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.leetcodeproblemm.SearchInABinarySearchTree.Node;

public class UnittestSearchInABinarySearchTree {

	@Test
	public void test() {
		SearchInABinarySearchTree s = new SearchInABinarySearchTree(4);
		s.insertLeft(s.root, 2);
		s.insertRight(s.root, 7);
		s.insertLeft(s.root.left, 1);
		s.insertLeft(s.root.right, 3);
		Node res = SearchInABinarySearchTree.searchBST(s.root, 2);
		assertEquals(2, res.key);
	}
	@Test
	public void test1() {
		SearchInABinarySearchTree s = new SearchInABinarySearchTree(4);
		s.insertLeft(s.root, 2);
		s.insertRight(s.root, 7);
		s.insertLeft(s.root.left, 1);
		s.insertLeft(s.root.right, 3);
		Node res = SearchInABinarySearchTree.searchBST(s.root, 9);
		assertEquals(null, res);
	}
}
