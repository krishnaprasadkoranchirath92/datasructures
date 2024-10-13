package com.dsa.aplha.datastructures.dp3;

public class CoinChange {
//38

	public static void main(String[] args) {
		int[] coins = { 2, 5, 3, 6 };
		int sum = 10;
		coinChangeTabulation(coins, sum);
		int dp[][] = new int[coins.length + 1][sum + 1];
		for (int i = 0; i <= coins.length; i++) {
			for (int j = 0; j <= sum; j++) {
				dp[i][j] = -1;
			}
		}
		int ans = coinChangeMemoization(coins, sum, coins.length, dp);
		System.out.println("Coin Change with Memoization =" + ans);
	}

	private static int coinChangeMemoization(int[] coins, int sum, int n, int[][] dp) {
		if (dp[n][sum] != -1) {
			return dp[n][sum];
		}
		if (sum == 0) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		if (coins[n - 1] <= sum) {
			int inc = coinChangeMemoization(coins, sum - coins[n - 1], n, dp);
			int exc = coinChangeMemoization(coins, sum, n - 1, dp);
			dp[n][sum] = inc + exc;
		} else {
			dp[n][sum] = coinChangeMemoization(coins, sum, n - 1, dp);
		}
		return dp[n][sum];
	}

	private static void coinChangeTabulation(int[] coins, int sum) {
		int n = coins.length;
		int[][] dp = new int[coins.length + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				int c = coins[i - 1];
				if (c <= j) {
					dp[i][j] = dp[i][j - c]+dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		System.out.println("Maximum ways of coin change = " + dp[n][sum]);
	}
}
