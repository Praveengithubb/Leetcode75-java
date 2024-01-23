package com.practice.leetcodeproblemm;

class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

public class DeleteTheMiddleNodeOfALinkedList {
	public static Node deleteMiddle(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node slow = head;
		Node fast = head.next.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
		
	}

	public static void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);
		head1 = deleteMiddle(head1);
		display(head1);
	}
}
