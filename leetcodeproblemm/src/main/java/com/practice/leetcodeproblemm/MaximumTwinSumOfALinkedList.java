package com.practice.leetcodeproblemm;

public class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
		next = null;
	}
}

public class MaximumTwinSumOfALinkedList {

	public static void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static int pairSum(Node head) {
        Node slow = head;
        Node fast = head;
        int maxVal = 0;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node nextNode;
        Node prev = null;
        while(slow != null)
        {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        while(prev != null)
        {
            maxVal = Math.max(maxVal, head.val + prev.val);
            prev = prev.next;
            head = head.next;
        }
        return maxVal;
    }

	public static void main(String[] args) {

		Node head = new Node(5);
		head.next = new Node(4);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		int max = pairSum(head);
		System.out.println(max);
	}
}

