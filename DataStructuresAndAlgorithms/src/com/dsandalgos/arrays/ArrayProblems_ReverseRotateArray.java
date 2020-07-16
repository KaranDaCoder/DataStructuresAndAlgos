package com.dsandalgos.arrays;

import java.util.Arrays;

public class ArrayProblems_ReverseRotateArray {

	public static int[] reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		System.out.println("Array before reversing == " + Arrays.toString(arr));

		if (arr.length < 2) {
			System.out.println("Reversed Array with size < 2 == " + Arrays.toString(arr));
			return arr;
		}
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println("Reversed Array == " + Arrays.toString(arr));
		return arr;
	}

	public static int[] reverseArray(int[] Array, int start, int end) {
		System.out.println("Array before reversing == " + Arrays.toString(Array));

		if (Array.length < 2) {
			System.out.println("Reversed Array with size < 2 == " + Arrays.toString(Array));
			return Array;
		}

		while (start < end) {
			int temp = Array[start];
			Array[start] = Array[end];
			Array[end] = temp;
			start++;
			end--;
		}

		System.out.println("Reversed Array == " + Arrays.toString(Array));
		return Array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 2, 11 };
		// reverseArray(a, 0, a.length - 1);
		reverseArray(a);
	}

}
