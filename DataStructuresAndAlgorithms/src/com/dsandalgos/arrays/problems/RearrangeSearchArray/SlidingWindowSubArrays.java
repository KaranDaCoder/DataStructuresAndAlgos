package com.dsandalgos.arrays.problems.RearrangeSearchArray;

public class SlidingWindowSubArrays {

	public void printSumOfSlidingWindowArrayOfSizeK(int[] arr, int K) {

		// calculate sum of 1st sliding array from 0-->K
		int sliding_sum = 0;

		for (int i = 0; i < K; i++) {
			sliding_sum += arr[i];
		}

		System.out.println("1st Sliding sum === " + sliding_sum);
		// calculate sum of remaining windows by removing previous element and adding
		// new one
		for (int i = K; i < arr.length; i++) {
			sliding_sum = sliding_sum + (arr[i] - arr[i - K]);
			System.out.println("Sliding sum === " + sliding_sum);
		}

	}

	public int findMaximumOfSlidingWindowOfSizeK(int[] arr, int K) {
		// calculate the sum of first sliding window
		int sliding_sum = 0;
		int max_sliding_sum = 0;

		for (int i = 0; i < K; i++) {
			sliding_sum = sliding_sum + arr[i];
		}
		max_sliding_sum = sliding_sum;

		// calculate sum of remaining sliding windows by removing previous element and
		// adding new one
		for (int i = K; i < arr.length; i++) {
			sliding_sum = sliding_sum + (arr[i] - arr[i - K]);

			max_sliding_sum = Math.max(max_sliding_sum, sliding_sum);

		}
		System.out.println("Maximum sliding sum === " + max_sliding_sum);
		return max_sliding_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { -8, 3, 0, -1, 6 };

		SlidingWindowSubArrays slidingWindowSubArrays = new SlidingWindowSubArrays();
		slidingWindowSubArrays.findMaximumOfSlidingWindowOfSizeK(arr, 2);
		slidingWindowSubArrays.printSumOfSlidingWindowArrayOfSizeK(arr, 3);

	}

}
