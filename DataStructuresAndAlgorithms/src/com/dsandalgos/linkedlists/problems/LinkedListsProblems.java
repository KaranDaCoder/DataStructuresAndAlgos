package com.dsandalgos.linkedlists.problems;

public class LinkedListsProblems {
	private Node head;

	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Reverse a Singly LinkedList
	public Node reverseSinglyList(Node head) {
		if (head == null)
			return head;

		Node curr_node = head;
		Node new_head = null;
		Node next = null;

		while (curr_node != null) {
			next = curr_node.next;
			curr_node.next = new_head;
			new_head = curr_node;
			curr_node = next;
		}
		return new_head;
	}

	// find Middle Element Of a Singly Linked List
	public Node findMiddleElementOfSinglyLinkedList(Node head) {

		if (head == null)
			return head;

		Node current_node = head;
		Node runner_node = head;

		while (runner_node != null && runner_node.next != null) {
			current_node = current_node.next;
			runner_node = runner_node.next.next;
		}

		return current_node;
	}

	// find nTh element from end of a Singly Linked List
	public Node findNthElementFromTheEndOfSinglyLinkedList(Node head, int n) {
		Node curr_node = head;
		Node runner_node = head;
		int count = 0;

		// exception handling
		if (n <= 0)
			throw new IllegalArgumentException("Node size 0");
		// create a gap of n between current node and runner node
		while (count < n) {
			if (runner_node == null)
				throw new IllegalArgumentException("N cannot be greater than Linked List Size...");

			runner_node = runner_node.next;
			count++;
		}

		// keep moving current node and runner_node until runner_node != null
		while (runner_node != null) {
			curr_node = curr_node.next;
			runner_node = runner_node.next;
		}

		return curr_node;

	}

	// Remove Duplicates from A Sorted Singly Linked List
	public void removeDuplicatesFromSortedLinkedList(Node head) {
		Node curr_node = head;
		while (curr_node != null && curr_node.next != null) {
			if (curr_node.data == curr_node.next.data) {
				curr_node.next = curr_node.next.next;
			} else {
				curr_node = curr_node.next;
			}
		}
	}

	// Insert Node in Sorted Linked List without affecting the order
	public Node insertNodeInASortedLinkedListKeepingTheOrder(int data) {
		Node new_node = new Node(data);

		if (head == null)
			return new_node;

		Node temp = null;
		Node curr_node = head;

		while (curr_node != null && curr_node.data < new_node.data) {

			temp = curr_node;
			curr_node = curr_node.next;
		}
		new_node.next = curr_node;
		temp.next = new_node;

		return head;
	}

	// remove a node from linked list
	public Node removeNodeFromALinkedList(int data) {
		Node curr_node = head;
		Node runner = null;

		// if the data is from the head node
		if (curr_node != null && curr_node.data == data) {
			head = curr_node.next;
			return head;
		}

		while (curr_node != null && curr_node.data != data) {
			runner = curr_node;
			curr_node = curr_node.next;
		}
		// linked list exhausted but data not found
		if (curr_node == null) {
			System.out.println("element not found inside linked list");
			return head;
		}

		runner.next = curr_node.next;

		return head;
	}

	// detect a loop inside a Singly Linked List
	public boolean isLoopPresentInsideALinkedList() {
		Node curr_node = head;
		Node runner = head;
		// move curr node by 1 step and runner node by 2 steps
		while (runner != null && runner.next != null) {
			curr_node = curr_node.next;
			runner = runner.next.next;
			// if at any point they become equal, a loop is detected for sure.
			if (curr_node == runner)
				return true;
		}
		// else a loop is not detected inside Singly Linked List
		return false;
	}

	// Util to create a Lopped Linked List
	public void createLoopedLinkedList() {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node six = new Node(26);

		this.head = head; // 1--head
		head.next = second; // 1--2
		second.next = third; // 1--2--3
		third.next = fourth;// 1--2--3--4
		fourth.next = fifth;// 1--2--3--4--5
		fifth.next = six;// 1--2--3--4--5--26
		six.next = third; // 1--2--3--4--5--26--3--4--5--26--3--4--5--26--3--4...

	}

	// Utility to display Singly Linked List
	public void displayLinkedList(Node head_node) {
		Node curr_node = head_node;

		while (curr_node != null) {
			System.out.print(curr_node.data + "-->");
			curr_node = curr_node.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListsProblems linkedList = new LinkedListsProblems();

		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node six = new Node(16);

		linkedList.head.next = second;
		linkedList.head.next.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fourth.next.next = six;

		linkedList.displayLinkedList(linkedList.head);
		linkedList.insertNodeInASortedLinkedListKeepingTheOrder(10);
		linkedList.displayLinkedList(linkedList.head);
		linkedList.removeNodeFromALinkedList(111);
		linkedList.displayLinkedList(linkedList.head);
		linkedList.createLoopedLinkedList();
		System.out.println(linkedList.isLoopPresentInsideALinkedList());

	}

}
