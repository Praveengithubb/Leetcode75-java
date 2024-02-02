package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class UnittestBinaryTreeRightSideView {

	@Test
	public void test() {
		BinaryTreeRightSideView b = new BinaryTreeRightSideView();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);
		List<Integer> result = b.rightSideView(root);
		assertArrayEquals(new Integer[]{1, 3, 4}, result.toArray());
	}
	@Test
	public void test1() {
		BinaryTreeRightSideView b = new BinaryTreeRightSideView();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		List<Integer> result = b.rightSideView(root);
		assertArrayEquals(new Integer[]{1, 3}, result.toArray());
	}

}
