package com.dsa.aplha.datastructures.functions;

public class CheckPrime {

	public static void main(String[] args) {
		int n = 2;
		boolean p = false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				p = true;
				break;
			}
		}
		if (p) {
			System.out.println("Composite");
		} else {
			System.out.println("Prime");
		}
	}
}
