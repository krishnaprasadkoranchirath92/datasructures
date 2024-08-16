package com.dsa.aplha.datastructures.functions;

public class DecimalToBinary {

	public static void main(String[] args) {
//		8 = 1000
//		int n = 11;
//		String bin = toBinary(n);
//
//		toBinary1(n);
//		System.out.println(bin);
		int n = 8;
		int num = n;
		int r = 0;
		int b = 0;
		for (int i = 0; n > 0; i++) {
			r = n % 2;
			b += r * Math.pow(10, i);
			n /= 2;
		}
		System.out.println("Binary Equivalent of " + num + "=" + b);
	}

//	private static void toBinary1(int n) {
//		int b = 0;
//		for (int i = 0; n > 0; i++) {
//			int r = n % 2;
//			b = (int) (b + r * Math.pow(10, i));
//			n /= 2;
//
//		}
//		System.out.println("Binary value = " + b);
//	}
//
//	private static String toBinary(int n) {
//		int r = 0;
//		String d = "";
//		int dec = 0;
//		int num = n;
//		while (n > 0) {
//			r = n % 2;
//			dec = dec * 10 + r;
//			d = r + "" + d;
//			n = n / 2;
//		}
//		int x = 0;
//		int p = dec;
//		while (dec > 0) {
//			x = x * 10 + dec % 10;
//			dec /= 10;
//		}
//		System.out.println(x);
//		System.out.println(p);
//		return d;
//	}
}
