package com.practice.leetcodeproblemm;

public class SearchInABinarySearchTree {
	Node root;

	class Node {
		int key;
		Node left, right;

		public Node(int value) {
			key = value;
			left = right = null;
		}
	}

	public SearchInABinarySearchTree(int val) {
		root = new Node(val);
	}

	public void insertLeft(Node parentNode, int value) {
		parentNode.left = new Node(value);
	}

	public void insertRight(Node parentNode, int value) {
		parentNode.right = new Node(value);
	}

	public static Node searchBST(Node root, int val) {
		if (root == null || root.key == val)
			return root;
		if (val < root.key) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}

	public static void main(String[] args) {
		SearchInABinarySearchTree s = new SearchInABinarySearchTree(4);
		s.insertLeft(s.root, 2);
		s.insertRight(s.root, 7);
		s.insertLeft(s.root.left, 1);
		s.insertLeft(s.root.right, 3);
		Node res = SearchInABinarySearchTree.searchBST(s.root, 2);
		System.out.println(res.key);
	}
}
