package com.dsa.aplha.datastructures.arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int[] arr = { -1, 2, 1, -7, 4 };
		int l = Integer.MIN_VALUE;
		for (int a : arr) {
			if (l < a) {
				l = a;
			}
		}
		System.out.println("Largest number = " + l);
	}
}
