package com.dsa.aplha.datastructures.dp3;

public class RodCutting {
	public static void main(String[] args) {
		int[] length = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int rodLength = 8;
		int maxProfit = calculateMaxProfit(length, price, rodLength);
		System.out.println("maxProfit = " + maxProfit);
	}

	private static int calculateMaxProfit(int[] length, int[] price, int rodLength) {
		int n = length.length;
		int[][] dp = new int[n + 1][rodLength + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= rodLength; j++) {
				int l = length[i - 1];
				if (l <= j) {
					dp[i][j] = Math.max(price[i - 1] + dp[i][j - l], dp[i - 1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[n][rodLength];
	}

}
