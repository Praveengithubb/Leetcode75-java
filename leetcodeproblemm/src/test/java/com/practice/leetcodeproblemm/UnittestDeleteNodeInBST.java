	package com.practice.leetcodeproblemm;
	
	import static org.junit.Assert.*;
	
	import java.util.ArrayList;
	
	import org.junit.Test;
	
	public class UnittestDeleteNodeInBST {
	
		@Test
		public void test() {
			DeleteNodeInBST s = new DeleteNodeInBST(6);
	        DeleteNodeInBST.deleteNode(s.root, 2);
	        ArrayList<Integer>a = new ArrayList<Integer>();
	        a.add(6);
	        ArrayList<Integer> actualInorder = DeleteNodeInBST.inorderTraversal1(s.root);
	        assertEquals(a, actualInorder);
	}
		@Test
		public void test1() {
			DeleteNodeInBST s = new DeleteNodeInBST(5);
			s.insertLeft(s.root, 3);
			s.insertRight(s.root, 6);
			s.insertLeft(s.root.left, 2);
			s.insertLeft(s.root.right, 4);
			DeleteNodeInBST.deleteNode(s.root, 2);
	        DeleteNodeInBST.deleteNode(s.root, 2);
	        ArrayList<Integer>a = new ArrayList<Integer>();
	        a.add(3);
	        a.add(5);
	        a.add(4);
	        a.add(6);
	        ArrayList<Integer> actualInorder = DeleteNodeInBST.inorderTraversal1(s.root);
	        assertEquals(a, actualInorder);
	}
	
		}
