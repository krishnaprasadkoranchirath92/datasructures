package com.dsa.aplha.datastructures.dp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 10, 7, 40, 80 };
		int liss = lissTabulation(arr);
		System.out.println("LISS = " + liss);
	}

	private static int lissTabulation(int[] arr) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			set.add(i);
		}
		for (int i : set) {
			list.add(i);
		}
		Collections.sort(list);
		int[][] dp = new int[arr.length + 1][list.size() + 1];
		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= list.size(); j++) {
				int e1 = arr[i - 1];
				int e2 = list.get(j - 1);
				if (e1 == e2) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j <= list.size(); j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return dp[arr.length][list.size()];
	}
}
