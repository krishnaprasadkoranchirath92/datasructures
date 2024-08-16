package com.dsa.aplha.datastructures.patterns2;

public class InvertedRotatedHalfPyramid {

	public static void main(String[] args) {
		int r = 4;
		int c = 4;
		printRectangle(r, c);
		System.out.println("------------");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c - i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void printRectangle(int r, int c) {
		int n = (r + c) / 2;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (j + i >= n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
