package com.dsa.aplha.datastructures.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int a : arr) {
			System.out.print(a + ", ");
		}
		int x;
		int first = 0;
		int last = arr.length - 1;
		while (first < last) {
			x = arr[first];
			arr[first] = arr[last];
			arr[last] = x;
			first++;
			last--;
		}
		System.out.println();
		for (int a : arr) {
			System.out.print(a + ", ");
		}
	}
}
