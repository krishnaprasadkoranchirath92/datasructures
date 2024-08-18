package com.dsa.aplha.datastructures.patterns2;

public class InvertedHalfPyramidWithNumbers {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(j+1);
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
