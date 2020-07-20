package com.dsandalgos.linkedlists;

//import com.dsandalgos.linkedlists.problems.LinkedListsProblems_ReverseLinkedList.Node;

public class CreateSinglyLinkedLists {
	private Node head;

	private static class Node {
		private int data;
		
		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Inserting a new node at start == creating a head node
	public void insertNodeAtStart(int data) {
		Node new_node = new Node(data); // create a new node data | null
		new_node.next = head; // point next of new node to head
		head = new_node; // assign head as new node
	}

	// Inserting a new node at the end of linked list
	public void insertNodeAtEnd(int data) {
		Node new_node_end = new Node(data);

		if (head == null) {
			head = new_node_end;
			return;
		}

		Node curr_node = head;
		while (curr_node.next != null) {
			curr_node = curr_node.next;
		}
		curr_node.next = new_node_end;
	}

	// fetch an element inside of a single Linked List
	public void fetchAnElementWithinLinkedList(CreateSinglyLinkedLists node, int data) {
		boolean flag = false;

		if (head == null) {
			System.out.println("Linked List is Empty!!");
			return;
		}

		Node curr_node = head;
		while (curr_node != null) {
			if (curr_node.data == data) {
				flag = true;
				break;
			}
			curr_node = curr_node.next;
		}
		if (flag) {
			System.out.println("Node with data " + data + " found");
		} else {
			System.out.println("Node with data " + data + " Not found");
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

		CreateSinglyLinkedLists createSinglyLinkedLists = new CreateSinglyLinkedLists();
		createSinglyLinkedLists.head = new Node(11); // 11|null
		Node second = new Node(22); // 22|null
		Node third = new Node(99); // 99|null
		Node fourth = new Node(8); // 8|null
		createSinglyLinkedLists.head.next = second;
		second.next = third;
		third.next = fourth;
//		System.out.println("Linked list and it's length before inserting a node at start... ");
//		createSinglyLinkedLists.display LinkedList();
//		createSinglyLinkedLists.getLengthOfLinkedList();
//
//		createSinglyLinkedLists.insertNodeAtStart(18);
//		System.out.println("Linked list and it's length After inserting a node at start... ");
//		// display the linkedlist
//		createSinglyLinkedLists.displayLinkedList();
//		// find length of LinkedList
//		createSinglyLinkedLists.getLengthOfLinkedList();
//
//		createSinglyLinkedLists.insertNodeAtEnd(44);
//		createSinglyLinkedLists.insertNodeAtEnd(144);
//		createSinglyLinkedLists.insertNodeAtStart(124);
//		createSinglyLinkedLists.displayLinkedList();
//		// find length of LinkedList
//		createSinglyLinkedLists.getLengthOfLinkedList();
//
//		createSinglyLinkedLists.fetchAnElementWithinLinkedList(createSinglyLinkedLists, 111);
		createSinglyLinkedLists.displayLinkedList();
		System.out.println(createSinglyLinkedLists.reverseSinglyList(createSinglyLinkedLists.head));
		createSinglyLinkedLists.displayLinkedList();
	}

}
