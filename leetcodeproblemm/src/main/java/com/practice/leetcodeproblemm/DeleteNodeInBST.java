package com.practice.leetcodeproblemm;

import java.util.ArrayList;

public class DeleteNodeInBST {
	Node root;

	class Node {
		Integer key;
		Node left, right;

		public Node(Integer value) {
			key = value;
			left = right = null;
		}
	}

	public DeleteNodeInBST(Integer val) {
		root = new Node(val);
	}

	public void insertLeft(Node parentNode, Integer value) {
		parentNode.left = new Node(value);
	}

	public void insertRight(Node parentNode, Integer value) {
		parentNode.right = new Node(value);
	}

	public static Node deleteNode(Node root, Integer key) {
		if (root == null) {
			return root;
		}
		if (key < root.key) {
			root.left = deleteNode(root.left, key);
		} else if (key > root.key) {
			root.right = deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				root.key = min(root.right);
				root.right = deleteNode(root.right, root.key);
			}
		}
		return root;
	}

	public static int min(Node root) {
		int minVal = root.key;
		while (root.left != null) {
			minVal = root.left.key;
			root = root.left;
		}
		return minVal;
	}

	public static void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.key + " ");
			inorderTraversal(root.right);
		}
	}

	public static ArrayList<Integer> inorderTraversal1(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            list.addAll(inorderTraversal1(root.left));
            list.add(root.key);
            list.addAll(inorderTraversal1(root.right));
        }
        return list;
        }

	public static void main(String[] args) {

		DeleteNodeInBST s = new DeleteNodeInBST(5);
		s.insertLeft(s.root, 3);
		s.insertRight(s.root, 6);
		s.insertLeft(s.root.left, 2);
		s.insertLeft(s.root.right, 4);
		DeleteNodeInBST.deleteNode(s.root, 2);
		inorderTraversal(s.root);
	}
}
