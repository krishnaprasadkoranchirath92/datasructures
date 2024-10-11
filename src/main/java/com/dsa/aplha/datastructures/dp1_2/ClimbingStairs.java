package com.dsa.aplha.datastructures.dp1_2;

public class ClimbingStairs {

	public static void main(String[] args) {
		maxWaysToClimbStairs(6);
		int n = 6;
		int[] dp = new int[n + 1];
		int m = maxWaysToClimbStairsMem(n, dp);
		System.out.println("Max ways to climb " + n + " stairs = " + m);
		maxWaysTOClimbStairs3(n);

	}

	private static void maxWaysTOClimbStairs3(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];

		}
		System.out.println("Max ways to climb " + n + " stairs with max 3 steps = " + dp[n]);
	}

	private static int maxWaysToClimbStairsMem(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		dp[n] = maxWaysToClimbStairsMem(n - 1, dp) + maxWaysToClimbStairsMem(n - 2, dp);
		return dp[n];
	}

	private static void maxWaysToClimbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println("Max ways to climb " + n + " stairs = " + dp[n]);
	}
}
