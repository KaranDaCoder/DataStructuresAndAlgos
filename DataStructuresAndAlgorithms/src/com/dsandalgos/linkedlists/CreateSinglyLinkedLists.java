package com.dsandalgos.linkedlists;

public class CreateSinglyLinkedLists {
	private Node head;

	
	
	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		
		
		CreateSinglyLinkedLists createSinglyLinkedLists = new CreateSinglyLinkedLists();
		createSinglyLinkedLists.head = new Node(11);
		Node second = new Node(22);
		Node third = new Node(99);
		Node fourth = new Node(8);

		createSinglyLinkedLists.head.next = second;
		second.next = third;
		third.next = fourth;
	}

}
