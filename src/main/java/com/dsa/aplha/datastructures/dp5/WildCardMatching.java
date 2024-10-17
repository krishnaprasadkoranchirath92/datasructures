package com.dsa.aplha.datastructures.dp5;

public class WildCardMatching {
	public static void main(String[] args) {
		String s = "baaabab";
		String p = "*****ba*****ab";
		if (isPatternMatch(s, p)) {
			System.out.println("Patterns match");
		} else {
			System.out.println("Patterns don't match");
		}
	}

	private static boolean isPatternMatch(String s, String p) {
		int n = s.length();
		int m = p.length();
		boolean[][] dp = new boolean[n + 1][m + 1];
		dp[0][0] = true;
		for (int i = 1; i <= n; i++) {
			dp[i][0] = false;
		}
		for (int i = 1; i <= m; i++) {
			if (p.charAt(i - 1) == '*') {
				dp[0][i] = dp[0][i - 1];
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
					dp[i][j] = dp[i - 1][j - 1];
				} else if (p.charAt(j - 1) == '*') {
					dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
				} else {
					dp[i][j] = false;
				}
			}
		}
		return dp[n][m];
	}

}
