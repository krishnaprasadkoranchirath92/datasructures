package com.dsa.aplha.datastructures.dp5;

import java.util.Arrays;

public class CatalanNumber {

	public static void main(String[] args) {
		int n = 6;
		int c = catalan(n);
		System.out.println("Catalan = " + c);
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		c = catalanMem(n, dp);
		System.out.println("Catalan with Memoization = " + c);
		c = catalanTab(n);
		System.out.println("Catalan with Tabulation = " + c);

	}

	private static int catalanTab(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = 0;
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i - j - 1];
			}
		}
		return dp[n];
	}
	
//	TC = O(n*n)

	private static int catalanMem(int n, int[] dp) {
		if (dp[n] != -1) {
			return dp[n];
		}
		if (n == 0 || n == 1) {
			dp[n] = 1;
			return dp[n];
		}
		int c = 0;
		for (int i = 0; i < n; i++) {
			c += catalanMem(i, dp) * catalanMem(n - i - 1, dp);
		}
		dp[n] = c;
		return dp[n];
	}

	private static int catalan(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int c = 0;
		for (int i = 0; i < n; i++) {
			c = c + catalan(i) * catalan(n - i - 1);
		}

		return c;
	}
}
//15.34
