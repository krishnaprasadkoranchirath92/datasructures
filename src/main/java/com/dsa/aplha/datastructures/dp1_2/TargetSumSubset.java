package com.dsa.aplha.datastructures.dp1_2;

public class TargetSumSubset {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 7, 1, 3 };
		int sum = 10;
		boolean ans = isTargetAchieved(nums, sum, nums.length);
		System.out.println("Is target sum acieved?" + ans);
	}

	private static boolean isTargetAchieved(int[] nums, int sum, int n) {
		boolean[][] dp = new boolean[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (nums[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		for(int i=0;i<dp.length;i++)
		System.out.println(dp[i]);
		return dp[n][sum];
	}

}

//2.05 - unbounded knapsack