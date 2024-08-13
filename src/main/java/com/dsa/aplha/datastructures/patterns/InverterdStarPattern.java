package com.dsa.aplha.datastructures.patterns;

public class InverterdStarPattern {

	public static void main(String[] args) {
		System.out.println("Inverted Star Pattern :");
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
