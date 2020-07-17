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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListsProblems_ReverseLinkedList linkedListsProblems_ReverseLinkedList
		 = new LinkedListsProblems_ReverseLinkedList();
	
	}

}
