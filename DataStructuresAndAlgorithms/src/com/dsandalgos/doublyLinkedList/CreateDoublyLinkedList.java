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
	public Node insertNodeAtTheEndOfDoublyLinkedList(int data) {
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
		length--;
		return temp;
	}

	public Node deleteNodeAtEndOfDoublyLinkedList() {
		Node temp = tail;

		if (isEmpty())
			throw new NoSuchElementException("Doubly Linked List is Empty...");

		if (head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
			
		}
		tail = tail.previous;
		length--;
		return temp;
	}
	// Utils to print Doubly Linked List

	// Print Doubly Linked List From Head
	public void printDoublyLinkedListForward() {

		System.out.println("Printing Doubly Linked List From Head...");
		if (head == null) {
			System.out.println("null");
			return;
		}

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
		if (tail == null) {
			System.out.println("null");
			return;
		}

		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "<-->");
			temp = temp.previous;
		}
		System.out.println("null");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateDoublyLinkedList createDoublyLinkedList = new CreateDoublyLinkedList();

		createDoublyLinkedList.insertNodeAtTheEndOfDoublyLinkedList(44);
		createDoublyLinkedList.insertNodeAtTheEndOfDoublyLinkedList(22);
		createDoublyLinkedList.insertNodeAtTheEndOfDoublyLinkedList(33);
		createDoublyLinkedList.insertNodeAtTheEndOfDoublyLinkedList(55);
		
		
		createDoublyLinkedList.printDoublyLinkedListForward();
		createDoublyLinkedList.deleteNodeAtEndOfDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();

		createDoublyLinkedList.deleteNodeAtEndOfDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();
		
		createDoublyLinkedList.deleteNodeAtEndOfDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();
		
		createDoublyLinkedList.deleteNodeAtEndOfDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();
		
		
		/*
		createDoublyLinkedList.printDoublyLinkedListForward();
		
		createDoublyLinkedList.deleteANodeAtBeginningInDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();

		createDoublyLinkedList.deleteANodeAtBeginningInDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();
		
		createDoublyLinkedList.deleteANodeAtBeginningInDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();
		
		createDoublyLinkedList.deleteANodeAtBeginningInDoublyLinkedList();
		createDoublyLinkedList.printDoublyLinkedListForward();
*/
	}

}
