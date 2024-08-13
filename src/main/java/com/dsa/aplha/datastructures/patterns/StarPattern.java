package com.dsa.aplha.datastructures.patterns;

public class StarPattern {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Star Pattern : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
