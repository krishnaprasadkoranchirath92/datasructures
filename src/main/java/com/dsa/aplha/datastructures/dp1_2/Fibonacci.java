package com.dsa.aplha.datastructures.dp1_2;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 6;
		int[] fib = new int[n + 1];// memoization
		System.out.println(calculateFibonacci(n, fib));

		System.out.println(calculateFibonacciTab(n));

	}

	private static int calculateFibonacciTab(int n) {
		int[] tab = new int[n + 1];
		tab[0] = 0;
		tab[1] = 1;
		for (int i = 2; i <= n; i++) {
			tab[i] = tab[i - 1] + tab[i - 2];
		}
		return tab[n];
	}

	private static int calculateFibonacci(int n, int[] fib) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (fib[n] != 0) {
			return fib[n];
		}
		return fib[n] = calculateFibonacci(n - 1, fib) + calculateFibonacci(n - 2, fib);
	}
}

//For recursion TC = O(2^n) -tree
//For DP TC = O(n)- skewed tree