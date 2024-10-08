package com.dsa.aplha.datastructures.dp1;

import java.util.Arrays;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		int val[] = { 15, 14, 10, 45, 30 };
		int wt[] = { 2, 5, 1, 3, 4 };
		int W = 7;
		int n = val.length;
		int maxProfit = recursion(val, wt, W, n);
		System.out.println("maxProfit = " + maxProfit);
		int[][] dp = new int[W + 1][n + 1];
		for (int i = 0; i <= W; i++) {
			Arrays.fill(dp[i], -1);
		}
		int memMaxProfit = memoization(val, wt, W, n, dp);
		System.out.println("memMaxProfit = " + memMaxProfit);
		int tabMaxProfit = tabulation(val, wt, W, n);
		System.out.println("tabMaxProfit = " + tabMaxProfit);

	}

	private static int tabulation(int[] val, int[] wt, int W, int n) {
		int dp[][] = new int[n + 1][W + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}
		for (int j = 0; j <= n; j++) {
			dp[0][j] = 0;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= W; j++) {
				int v = val[i - 1];
				int w = wt[i - 1];
				if (w <= j) {
					int inc = v + dp[i - 1][j - w];
					int exc = dp[i - 1][j];
					dp[i][j] = Math.max(inc, exc);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[n][W];
	}

	private static int memoization(int[] val, int[] wt, int W, int n, int[][] dp) {
		if (n == 0 || W == 0) {
			return 0;
		}
		if (dp[W][n] != -1) {
			return dp[W][n];
		}
		if (wt[n - 1] <= W) {
			int a1 = val[n - 1] + memoization(val, wt, W - wt[n - 1], n - 1, dp);
			int a2 = memoization(val, wt, W, n - 1, dp);
			dp[W][n] = Math.max(a1, a2);
			return dp[W][n];
		} else {
			dp[W][n] = memoization(val, wt, W, n - 1, dp);
			return dp[W][n];
		}
	}

	private static int recursion(int[] val, int[] wt, int W, int n) {
		if (n == 0 || W == 0) {
			return 0;
		}
		if (wt[n - 1] > W) {
			return recursion(val, wt, W, n - 1);
		} else {
			int ans1 = val[n - 1] + recursion(val, wt, W - wt[n - 1], n - 1);
			int ans2 = recursion(val, wt, W, n - 1);
			return Math.max(ans1, ans2);
		}
	}
}

//1.24	