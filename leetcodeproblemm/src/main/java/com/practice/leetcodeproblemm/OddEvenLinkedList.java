package com.practice.leetcodeproblemm;

public class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

public class OddEvenLinkedList {

	public static void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static Node oddEvenList(Node head) {
		int count = 1;
		Node oddHead = null;
		Node oddTail = null;
		Node evenHead = null;
		Node evenTail = null;
		while (head != null) {
			if (count % 2 == 1) {
				if (oddHead == null) {
					oddHead = head;
					oddTail = head;
					head = head.next;
				} else {

					oddTail.next = head;
					oddTail = oddTail.next;
					head = head.next;

				}
			} else {
				if (evenHead == null) {
					evenHead = head;
					evenTail = head;
					head = head.next;
				} else {
					evenTail.next = head;
					evenTail = evenTail.next;
					head = head.next;
				}
			}
			count++;
		}
		if (oddHead == null) {
			return evenHead;
		}
		if (evenHead == null) {
			return oddHead;
		}
		evenTail.next = null;
		oddTail.next = evenHead;
		return oddHead;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head = oddEvenList(head);
		display(head);

	}

}
