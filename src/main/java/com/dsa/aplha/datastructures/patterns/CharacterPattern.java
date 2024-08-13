package com.dsa.aplha.datastructures.patterns;

public class CharacterPattern {

//	public static void main(String[] args) {
//		int start = (char) 'A';
//		int end = (char) 'Z';
//		int limit = 10;
//		int c = 0;
//		for (int i = 0; i < limit; i++) {
//			for (int j = 0; j < i && c + start <= end; j++) {
//				System.out.print((char) (start + c) + " ");
//				c++;
//
//			}
//			System.out.println();
//		}
//
//	}

	public static void main(String[] args) {
		char ch = 'A';
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
