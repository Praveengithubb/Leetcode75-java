package com.practice.leetcodeproblemm;

public class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

public class ReverseLinkedList {

	public static void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static Node reverseList(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head = reverseList(head);
		display(head);

	}

}
