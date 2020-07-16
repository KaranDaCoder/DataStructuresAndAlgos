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

	// display linked list
	public void displayLinkedList() {
		Node curr_node = head;

		while (curr_node != null) {
			System.out.print(curr_node.data + " --->");
			curr_node = curr_node.next;
		}

		System.out.println("null");
	}

	// find length of LinkedList
	public int getLengthOfLinkedList() {
		Node curr_node = head;
		int count = 0;
		while (curr_node != null) {
			count++;
			curr_node = curr_node.next;
		}

		System.out.println("Length of LinkedList == " + count);
		return count;
	}

	public static void main(String[] args) {

		CreateSinglyLinkedLists createSinglyLinkedLists = new CreateSinglyLinkedLists();
		createSinglyLinkedLists.head = new Node(11); // 11|null
		Node second = new Node(22); // 22|null
		Node third = new Node(99); // 99|null
		Node fourth = new Node(8); // 8|null

		createSinglyLinkedLists.head.next = second;
		second.next = third;
		third.next = fourth;

		// display the linkedlist
		createSinglyLinkedLists.displayLinkedList();
		// find length of LinkedList
		createSinglyLinkedLists.getLengthOfLinkedList();
	}

}
