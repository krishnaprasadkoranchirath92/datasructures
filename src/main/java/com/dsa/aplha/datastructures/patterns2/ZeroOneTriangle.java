package com.dsa.aplha.datastructures.patterns2;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		int n = 5;
		int c = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c + " ");
				c = c == 1 ? 0 : 1;
			}
			System.out.println();
		}
		System.out.println("===========================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}
