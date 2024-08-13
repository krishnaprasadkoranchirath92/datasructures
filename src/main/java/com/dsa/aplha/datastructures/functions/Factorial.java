package com.dsa.aplha.datastructures.functions;

public class Factorial {

	public static void main(String[] args) {
		int f = factorial(4);
		System.out.println(f);
		bc(5, 2);
	}

	private static void bc(int n, int r) {
		int b;
		b = factorial(n) / (factorial(r) * factorial(n - r));
		System.out.println("binomial coefficietn = " + b);
	}

//	private static int factorial(int n) {
//		int fact = n;
//		for (int i = n; i > 1; i--) {
//			fact = fact * (i - 1);
//		}
//		return fact;
//	}

	private static int factorial(int n) {
		int fact = 1;
		for (int i = 0; i < n; i++) {
			fact = fact * (i + 1);
		}
		return fact;
	}
}
