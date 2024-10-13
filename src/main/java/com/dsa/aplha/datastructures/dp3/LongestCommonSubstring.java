package com.dsa.aplha.datastructures.dp3;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = "ABGCE";
		int maxSubstringLenght = lcSubstring(str1, str2);
		System.out.println("maxSubstringLenght =" + maxSubstringLenght);

	}

	private static int lcSubstring(String str1, String str2) {
		int maxSubstringLenght = 0;
		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = 0;
				}
				maxSubstringLenght = Math.max(maxSubstringLenght, dp[i][j]);
			}
		}

		for (int i = 0; i <= str1.length(); i++) {
			for (int j = 0; j <= str2.length(); j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return maxSubstringLenght;
	}
}
