package com.dsa.aplha.datastructures.dp1_2;

public class UnboundedKanpsack {

	public static void main(String[] args) {
		int val[] = { 15, 14, 10, 45, 30 };
		int wt[] = { 2, 5, 1, 3, 4 };
		int W = 7;
		int n = val.length;
		System.out.println(unboundedKnapsackTab(val, wt, W, n));
	}

	private static int unboundedKnapsackTab(int[] val, int[] wt, int W, int n) {
		int dp[][] = new int[n + 1][W + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= W; j++) {
				if (wt[i - 1] <= j) {
					dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][W];
	}
}

//TC = O(n*W)