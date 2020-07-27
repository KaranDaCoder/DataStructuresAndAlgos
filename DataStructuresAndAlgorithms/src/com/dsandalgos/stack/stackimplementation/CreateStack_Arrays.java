package com.dsandalgos.stack.stackimplementation;

import java.util.EmptyStackException;

public class CreateStack_Arrays {

	private int[] stack;
	private int length;
	private int size;

	public CreateStack_Arrays(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.stack = new int[size];
		length = -1;
	}

	public boolean isStackEmpty() {
		return length < 0;
	}

	public int getStackSize() {
		return length;
	}

	public void push(int data) {

		if (length == size)
			throw new StackOverflowError("Stack Limit reached");

		stack[++length] = data;
	}

	public int pop() {
		if (isStackEmpty())
			throw new EmptyStackException();

		int popped = stack[length--];
		return popped;
	}

	public int peek() {
		if (isStackEmpty())
			throw new EmptyStackException();

		return stack[length];
	}

	public void displayStack() {
		for (int i = 0; i <= length; i++) {
			System.out.print(stack[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateStack_Arrays createStack_Arrays = new CreateStack_Arrays(4);
		createStack_Arrays.push(21);
		createStack_Arrays.push(31);
		createStack_Arrays.push(121);
		createStack_Arrays.push(-21);
		createStack_Arrays.displayStack();
		System.out.println(createStack_Arrays.peek());
		createStack_Arrays.pop();
	//	System.out.println(createStack_Arrays.peek());
		createStack_Arrays.displayStack();
		

	}

}
