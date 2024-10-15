package com.dsa.aplha.datastructures.dp4;

public class StringConversion {
	public static void main(String[] args) {
		String str1 = "intention";
		String str2 = "execution";
		numOfDelsAndInserts(str1, str2);
		int n = minDelsAndInserts(str1, str2);
		System.out.println("min = " + n);
	}

	private static int minDelsAndInserts(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = i;
		}
		for (int i = 0; i <= m; i++) {
			dp[0][i] = i;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[n][m];
	}

	private static int numOfDelsAndInserts(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int lcs = dp[n][m];
		int dels = Math.max(n, m) - lcs;
		int adds = Math.min(n, m) - lcs;
		System.out.println("dels = " + dels);
		System.out.println("adds = " + adds);
//String1 ->(dels) ->LCS ->(adds) -> String2
//		Total operations(add and delete) = dels+adds
		return dp[n][m];
	}
}
