package com.dsa.aplha.datastructures.dp3;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "ace";
		int ans = lcsRecursion(str1, str2, str1.length(), str2.length());
		System.out.println("Length of LCS = " + ans);
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		lcsMemoization(str1, str2, str1.length(), str2.length(), dp);
		System.out.println("Length of LCS in recursion with memoization = " + dp[str1.length()][str2.length()]);
		System.out.println("Length of LCS in recursion with tabulation = " + lcsTabulation(str1, str2));

	}

	private static int lcsTabulation(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int dp[][] = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[n][m];
	}

	private static int lcsMemoization(String str1, String str2, int n, int m, int[][] dp) {
		if (n == 0 || m == 0) {
			return 0;
		}
		if (dp[n][m] != 0) {
			return dp[n][m];
		}
		char c1 = str1.charAt(n - 1);
		char c2 = str2.charAt(m - 1);
		if (c1 == c2) {
			dp[n][m] = 1 + lcsMemoization(str1, str2, n - 1, m - 1, dp);
		} else {
			dp[n][m] = Math.max(lcsMemoization(str1, str2, n, m - 1, dp), lcsMemoization(str1, str2, n - 1, m, dp));
		}
		return dp[n][m];
	}

	private static int lcsRecursion(String str1, String str2, int n, int m) {
		if (n == 0 || m == 0) {
			return 0;
		}
		if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
			return 1 + lcsRecursion(str1, str2, n - 1, m - 1);
		} else {
			return Math.max(lcsRecursion(str1, str2, n - 1, m), lcsRecursion(str1, str2, n, m - 1));
		}
	}
}
