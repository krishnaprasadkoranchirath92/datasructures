package com.dsa.aplha.datastructures.arrays;

public class PrintSubarrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		printSubArrays(arr);

	}

	private static void printSubArrays(int[] arr) {
		int n = arr.length;
		int minSum = Integer.MAX_VALUE;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print("(");
				int sum = 0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + ",");
					sum = sum + arr[k];
					if (sum < minSum) {
						minSum = sum;
					}
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
				System.out.print(") = " + sum);
			}
		}
		System.out.println("Number of subarrays = " + (n * (n + 1) / 2));
		System.out.println("Max Sum = " + maxSum);
		System.out.println("Min Sum = " + minSum);
	}

}
