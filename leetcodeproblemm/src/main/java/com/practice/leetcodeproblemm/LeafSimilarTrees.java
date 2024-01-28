package com.practice.leetcodeproblemm;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
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

	public LeafSimilarTrees(int d) {
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

	public static boolean leafSimilar(Node root1, Node root2) {
		List<Integer> nodeList1 = new ArrayList();
		List<Integer> nodeList2 = new ArrayList();
		find(root1, nodeList1);
		find(root2, nodeList2);
		return nodeList1.equals(nodeList2);
	}

	public static void find(Node root, List<Integer> nodelist) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			nodelist.add(root.data);
		} else {
			find(root.left, nodelist);
			find(root.right, nodelist);
		}
	}

	public static void main(String[] args) {
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
		System.out.println(leafSimilar(tree.root, tree1.root));

	}
}
