package com.dsa.aplha.datastructures.functions;

public class PrimesInRange {

	public static void main(String[] args) {
		int r = 20;
		printPrimes(r);
	}

	private static void printPrimes(int r) {

		for (int i = 2; i <= r; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n == 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
