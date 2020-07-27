package com.dsandalgos.stack.stackimplementation;

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

	public int getLength() {
		return length;
	}

	public boolean isStackEmpty() {
		return length > 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
