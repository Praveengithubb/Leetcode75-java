package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

public class UnitTestDeleteTheMiddleNodeOfLinkedList {

	@Test
	public void test() {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		
		head1 = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head1);
		assertEquals(1,head1.val);
		assertEquals(2,head1.next.val);
		assertEquals(4,head1.next.next.val);
		assertEquals(5,head1.next.next.next.val);
	}
	@Test
	public void test1() {
		Node head1 = new Node(1);
		head1.next = new Node(2);
	
		head1 = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head1);
		assertEquals(1,head1.val);
	}
	@Test
	public void test2() {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		
		head1 = DeleteTheMiddleNodeOfALinkedList.deleteMiddle(head1);
		assertEquals(1,head1.val);
		assertEquals(2,head1.next.val);
		assertEquals(4,head1.next.next.val);
	}
}
