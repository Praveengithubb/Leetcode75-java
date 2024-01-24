package com.practice.leetcodeproblemm;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnittestOddEvenLinkedList {
	private static String getLinkedListAsString(Node head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.val).append(" ");
			head = head.next;
		}
		return sb.toString().trim();
	}

	@Test
	public void test() {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);

		Node result1 = OddEvenLinkedList.oddEvenList(head1);
		assertEquals("1 3 5 2 4", getLinkedListAsString(result1));
	}

	@Test
	public void test1() {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);

		Node result1 = OddEvenLinkedList.oddEvenList(head1);
		assertEquals("1 3 2 4", getLinkedListAsString(result1));
	}
}
