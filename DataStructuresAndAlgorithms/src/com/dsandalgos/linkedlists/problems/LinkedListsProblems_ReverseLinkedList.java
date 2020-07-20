package com.dsandalgos.linkedlists.problems;

public class LinkedListsProblems_ReverseLinkedList {
	private Node head;

	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node reverseSinglyList(Node head) {
		if (head == null)
			return head;

		Node curr_node = head;
		Node new_head = null;
		Node next = null;

		while (curr_node != null) {
			next = curr_node.next;
			curr_node = new_head;
			new_head = curr_node;
			curr_node = next;
		}
		System.out.println(new_head);
		return new_head;

	}

	public void displayLinkedList() {
		Node curr_node = head;

		if (curr_node == null)
			return;

		while (curr_node != null) {
			System.out.print(curr_node.data + "-->");
			curr_node = curr_node.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListsProblems_ReverseLinkedList linkedListsProblems_ReverseLinkedList = new LinkedListsProblems_ReverseLinkedList();
		linkedListsProblems_ReverseLinkedList.head = new Node (12); // 12 | null;
		Node second = new Node(423); // 423 | null
		Node third = new Node(14);  // 14 | null;
		Node fourth = new Node(44);	// 44 | null
		// Link the linked list
		linkedListsProblems_ReverseLinkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Linked List before reversal ... ");
		linkedListsProblems_ReverseLinkedList.displayLinkedList();
		Node new_head = linkedListsProblems_ReverseLinkedList.reverseSinglyList(linkedListsProblems_ReverseLinkedList.head);
		linkedListsProblems_ReverseLinkedList.reverseSinglyList(new_head);
		
	}

}
