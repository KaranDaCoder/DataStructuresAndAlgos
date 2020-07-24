package com.dsandalgos.doublyLinkedList;

import java.util.NoSuchElementException;

public class CreateDoublyLinkedList {
	// Doubly Linked List has --- Head and Tail
	private Node head;
	private Node tail;
	private int length;

	private class Node {
		private int data;
		private Node next;
		private Node previous;

		public Node(int data) {
			this.data = data;
		}
	}

	public CreateDoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	// check if doubly linked list is empty
	public boolean isEmpty() {
		return length == 0;
	}

	// return length of doubly linked list
	public int getLinkedListLength() {
		return length;
	}

	// Insert Node at the beginning of a Doubly Linked List
	public Node insertNodeAtBeginningOfDoublyLinkedList(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
			newNode.next = head;
		}
		head = newNode;
		length++;
		return head;
	}

	// Insert Node at the End of a Doubly Linked List
	public Node inserNodeAtTheEndOfDoublyLinkedList(int data) {
		Node node = new Node(data);

		if (isEmpty()) {
			head = node;
		} else {
			tail.next = node;
			node.previous = tail;
		}

		tail = node;
		length++;
		return tail;
	}

	// Delete a Node at the Beginning of a Doubly Linked List
	public Node deleteANodeAtBeginningInDoublyLinkedList() {
		Node temp = head;

		if (isEmpty())
			throw new NoSuchElementException("Doubly Linked List is Empty..");

		if (head == tail)
			tail = null;
		else {
			head.next.previous = null;
		}

		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}
	// Utils to print Doubly Linked List

	// Print Doubly Linked List From Head
	public void printDoublyLinkedListForward() {

		System.out.println("Printing Doubly Linked List From Head...");
		if (head == null)
			return;

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "<--->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	// Print Doubly Linked List From Tail
	public void printDoublyLinkedListBackward() {
		System.out.println("Printing Doubly Linked List From Tail...");
		if (tail == null)
			return;

		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "<-->");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateDoublyLinkedList createDoublyLinkedList = new CreateDoublyLinkedList();
		createDoublyLinkedList.insertNodeAtBeginningOfDoublyLinkedList(11);
		createDoublyLinkedList.insertNodeAtBeginningOfDoublyLinkedList(22);
		createDoublyLinkedList.insertNodeAtBeginningOfDoublyLinkedList(33);
		createDoublyLinkedList.inserNodeAtTheEndOfDoublyLinkedList(44);
		createDoublyLinkedList.inserNodeAtTheEndOfDoublyLinkedList(55);
		createDoublyLinkedList.printDoublyLinkedListBackward();
		createDoublyLinkedList.deleteANodeAtBeginningInDoublyLinkedList();
		// createDoublyLinkedList.printDoublyLinkedListForward();
		createDoublyLinkedList.printDoublyLinkedListBackward();

	}

}
