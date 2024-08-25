package com.dsa.aplha.datastructures.arrays;

public class PairsInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		printPairs(arr);
	}

	private static void printPairs(int[] arr) {
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + arr[i] + "," + arr[j] + ")");
				p++;
			}
		}
		System.out.println("Number of pairs = " + p);

		System.out.println("Number of pairs = " + (arr.length * (arr.length - 1)) / 2);
	}
}
