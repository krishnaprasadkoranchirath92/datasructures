package com.dsa.aplha.datastructures.patterns2;

public class SolidRhombus {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == 0 || i == n - 1)// hollow rhombus
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
