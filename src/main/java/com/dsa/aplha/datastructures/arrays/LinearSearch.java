package com.dsa.aplha.datastructures.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int n = 10;
		System.out.println(n + " is number present in index =  " + linearSearch(num, n));
	}

	private static int linearSearch(int[] num, int n) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
