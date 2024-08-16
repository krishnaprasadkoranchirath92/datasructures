package com.dsa.aplha.datastructures.patterns2;

public class HollowRectangle {

	public static void main(String[] args) {
		int r = 5;
		int c = 8;
		printHollowRectangle(r, c);
	}

	private static void printHollowRectangle(int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
