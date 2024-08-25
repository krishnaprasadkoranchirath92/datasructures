package com.dsa.aplha.datastructures.arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
		int s = 8;
		int i = 0;
		int j = arr.length - 1;
		boolean f = false;
		while (j >= i) {
			int m = (i + j) / 2;
			if (arr[m] == s) {
				f = true;
				System.out.println(m);
				break;
			} else if (arr[m] > s) {
				j = m - 1;
			} else {
				i = m + 1;
			}
		}
		if (f) {
			System.out.println("found");
		} else {
			System.out.println("Not found");
		}
	}
}
