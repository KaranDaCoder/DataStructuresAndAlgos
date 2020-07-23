package com.dsandalgos.arrays.problems;

public class ArrayProblems_FindNthLargestSmallestElements {

	// 1. Find smallest Element in Array w/o sorting
	public int findSmallestElementInArrayWithoutSorting(int[] arr) {
		int smallestElement = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallestElement) {
				smallestElement = arr[i];
			}
		}
		System.out.println("Smallest Element in Unsorted Array == " + smallestElement);
		return smallestElement;
	}

	// 2. Find largest Element in Array w/o sorting
	public int findLargestElementInArrayWithoutSorting(int[] arr) {
		int largestElement = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestElement) {
				largestElement = arr[i];
			}
		}
		System.out.println("Largest Element in Unsorted Array == " + largestElement);
		return largestElement;
	}

	// 3. Find 2nd smallest Element in Array w/o sorting
	public int findSecondSmallestElementInArrayWithoutSorting(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			// find the smallest element and assign it to arr[i]; assign secondSmallest to
			// smallest
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			// smallest < arr[i] < secondSmallest
			if (smallest < arr[i] && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Second Smallest Element in Unsorted Array== " + secondSmallest);
		return secondSmallest;
	}

	// 4. Find 2nd largest Element in Array w/o sorting
	public int findSecondLargestElementInArrayWithoutSorting(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}

			if (largest > arr[i] && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest Element in Unsorted Array== " + secondLargest);
		return secondLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { -5, 40, 888, -11, 9, 1111 };

		ArrayProblems_FindNthLargestSmallestElements arrayProblems_FindNthLargestSmallestElements = new ArrayProblems_FindNthLargestSmallestElements();
		arrayProblems_FindNthLargestSmallestElements.findLargestElementInArrayWithoutSorting(arr);
		arrayProblems_FindNthLargestSmallestElements.findSmallestElementInArrayWithoutSorting(arr);
		arrayProblems_FindNthLargestSmallestElements.findSecondSmallestElementInArrayWithoutSorting(arr);
		arrayProblems_FindNthLargestSmallestElements.findSecondLargestElementInArrayWithoutSorting(arr);
	}

}
