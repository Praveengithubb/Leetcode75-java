package com.practice.leetcodeproblemm;

public class CountGoodNodesInBinaryTree {
	Node root;

	class Node {
		int data;
		Node left, right;

		public Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	public CountGoodNodesInBinaryTree(int d) {
		root = new Node(d);

	}

	public void insertleft(Node r, Integer val) {
		Node newNode = new Node(val);
		r.left = newNode;
	}

	public void insertright(Node r, int val) {
		Node newNode = new Node(val);
		r.right = newNode;
	}

	public static int ans = 0;

	public static int goodNode(Node root) {

		traversal(root, root.data);
		return ans;
	}

	public static void traversal(Node root, int data) {
		if (root == null) {
			return;
		}
		if (root.data >= data) {
			ans++;
			data = root.data;
		}
		traversal(root.left, data);
		traversal(root.right, data);
	}

	public static void main(String[] args) {
		CountGoodNodesInBinaryTree tree = new CountGoodNodesInBinaryTree(10);
		tree.insertleft(tree.root, 1);
        tree.insertright(tree.root, 4);
        tree.insertleft(tree.root.left, 3);
        tree.insertright(tree.root.left, 1);
        tree.insertright(tree.root.right, 5);
        System.out.println(goodNode(tree.root));
	}
}
