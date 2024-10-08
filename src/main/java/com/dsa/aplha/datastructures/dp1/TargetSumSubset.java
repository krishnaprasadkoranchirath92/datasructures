package com.dsa.aplha.datastructures.dp1;

public class TargetSumSubset {
	public static void main(String[] args) {
		int nums[] = { 4, 2, 7, 1, 3 };
		int sum = 10;
		getTargetSum(nums, sum);
	}

	private static void getTargetSum(int[] nums, int sum) {
		int n = nums.length;
		boolean[][] dp = new boolean[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}
		for (int i = 1; i <= sum; i++) {
			dp[0][i] = false;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (nums[i-1] <= j) {
					boolean inc = dp[i - 1][j - nums[i-1]];
					boolean exc = dp[i - 1][j];
					dp[i][j] = inc || exc;
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		System.out.println("Answer  = " + dp[n][sum]);
	}
}

//1.52