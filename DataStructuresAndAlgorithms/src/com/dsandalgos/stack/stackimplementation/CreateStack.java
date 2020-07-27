package com.dsandalgos.stack.stackimplementation;

import java.util.EmptyStackException;

public class CreateStack {
	private Node top;
	private int length;

	private class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public CreateStack() {
		top = null;
		length = 0;
	}

	// get stack length
	public int getLength() {
		return length;
	}

	public boolean isStackEmpty() {
		return length < 0;
	}

	// push element inside a stack
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
		length++;
	}

	// pop an element from the stack
	public int pop() {
		if (isStackEmpty())
			throw new EmptyStackException();
		
		int res = top.data;
		top = top.next;
		length--;
		return res;
	}

	// get top-most element in stack
	public int peek() {

		if (isStackEmpty())
			throw new EmptyStackException();
		
		return top.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateStack createStack = new CreateStack();
		createStack.push(10);
		createStack.push(20);
		createStack.push(30);
		System.out.println(createStack.peek());
		createStack.pop();
		System.out.println(createStack.peek());
	}

}
