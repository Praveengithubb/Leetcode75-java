package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestTwinSumOfALinkedList {

	@Test
	public void test() {
		Node head1 = new Node(5);
		head1.next = new Node(4);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(2);
		head1.next.next.next.next = new Node(1);
		int max = MaximumTwinSumOfALinkedList.pairSum(head1);
		assertEquals(6, max);
	}
	@Test
	public void test1() {
		Node head1 = new Node(4);
		head1.next = new Node(2);
		head1.next.next = new Node(2);
		head1.next.next.next = new Node(3);
		int max = MaximumTwinSumOfALinkedList.pairSum(head1);
		assertEquals(7, max);
	}
	@Test
	public void test2() {
		Node head1 = new Node(1);
		head1.next = new Node(10000);
		int max = MaximumTwinSumOfALinkedList.pairSum(head1);
		assertEquals(10001, max);
	}
}
