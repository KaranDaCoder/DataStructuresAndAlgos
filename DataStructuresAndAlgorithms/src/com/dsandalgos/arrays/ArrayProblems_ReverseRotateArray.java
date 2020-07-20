package com.dsandalgos.arrays;

import java.util.Arrays;

public class ArrayProblems_ReverseRotateArray {

	/*
	 * reverse a given array return : reversed array O(n)
	 */
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

	/*
	 * reverse a given array with start and end indices (Useful during array
	 * rotations) return : reversed array O(n)
	 */
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

	// 0 1 2 3 4 5 6
	// Array before reversing == [2, 4, 9, 1, 6, 5, 11] // given array
	// Reversed Array first == [1, 9, 4, 2, 6, 5, 11] // 0 --> L - 1 - K
	// Reversed Array second == [1, 9, 4, 2, 11, 5, 6] // L - K --> L - 1
	// Reversed Array third == [6, 5, 11, 2, 4, 9, 1] // 0 --> L - 1
	public static int[] rightRotateArrayByK(int[] arr, int k) {
		if (k == 0)
			return arr;

		k = k % arr.length;
		int len = arr.length - 1;

		reverseArray(arr, 0, len - k);
		reverseArray(arr, arr.length - k, len);
		reverseArray(arr, 0, len);
		System.out.println(Arrays.toString(arr));

		return arr;

	}

	// 0 1 2 3 4 5 6
	// Array before reversing == [2, 4, 9, 1, 6, 5, 11]
	// Reversed Array first == [9, 4, 2, 1, 6, 5, 11] // 0 --> K-1
	// Reversed Array second== [9, 4, 2, 11, 5, 6, 1] // K --> L-1
	// Reversed Array third== [1,6,5,11,2,4,9] // 0 --> L-1

	public static int[] leftRotateArrayByK(int[] arr, int K) {

		if (K == 0)
			return arr;

		K = K % arr.length % 10;
		int len = arr.length - 1;

		reverseArray(arr, 0, K - 1);
		reverseArray(arr, K, len);
		reverseArray(arr, 0, len);

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 2, 4, 9, 1, 6, 5, 11 };
		// reverseArray(a, 0, a.length - 1);
		// reverseArray(a);
		leftRotateArrayByK(a, 3);
	}

}
