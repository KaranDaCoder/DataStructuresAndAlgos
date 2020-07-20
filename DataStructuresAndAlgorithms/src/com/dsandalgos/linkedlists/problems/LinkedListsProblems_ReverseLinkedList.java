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
			curr_node.next = new_head;
			new_head = curr_node;
			curr_node = next;
		}
		return new_head;

	}

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
		
		LinkedListsProblems_ReverseLinkedList linkedList = new LinkedListsProblems_ReverseLinkedList();
		
		
		Node head = new Node(21);
		Node second = new Node(22);
		Node third = new Node(412);
		Node fourth = new Node(11);
		
		head.next = second;
		head.next.next = third;
		third.next = fourth;
		
		linkedList.displayLinkedList(head);
		
		linkedList.displayLinkedList(linkedList.reverseSinglyList(head));
	
		
	}

}
