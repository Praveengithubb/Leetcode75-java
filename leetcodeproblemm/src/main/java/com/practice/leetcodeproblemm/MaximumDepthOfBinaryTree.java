package com.practice.leetcodeproblemm;

public class MaximumDepthOfBinaryTree {
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

	public MaximumDepthOfBinaryTree(int d) {
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

	public static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		int lh = maxDepth(root.left);
		int rh = maxDepth(root.right);
		return Math.max(lh, rh) + 1;
	}
	public static int ans = 0;
	public static int goodNode(Node root)
	{
		
		traversal(root,root.data);
		return ans;
	}
	public static void traversal(Node root, int data)
	{
		if (root==null)
		{
			return;
		}
		 if (root.data >= data) {
             ans++;
             data=root.data;
         }
		  traversal(root.left,data);
	        traversal(root.right,data);
	}
	public static void main(String[] args) {
		MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree(3);
		tree.insertleft(tree.root, 5);
		tree.insertright(tree.root, 15); 
		tree.insertleft(tree.root.left, 3);
		tree.insertright(tree.root.left, 8);
		tree.insertleft(tree.root.right, 12);
		System.out.println(goodNode(tree.root));
	}
}
