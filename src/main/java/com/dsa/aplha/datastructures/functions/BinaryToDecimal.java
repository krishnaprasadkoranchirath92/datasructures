package com.dsa.aplha.datastructures.functions;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int n = 1010;
		int num = n;
		int d = 0;
		int r = 0;
		for (int i = 0; n > 0; i++) {
			r = n % 10;
			d += r * Math.pow(2, i);
			n /= 10;
		}
		{}
		System.out.println("Decimal equivalent of " + num + "=" + d);
//		int dec = getDecimal(n);
//		System.out.println(dec);
	}

//	private static int getDecimal(int n) {
////		int i=0;
//		int r = 0;
//		int dec = 0;
////		r*Math.pow(2, i);
//		for (int i = 0; n > 0; i++) {
//			r = n % 10;
//			dec = (int) (dec + r * Math.pow(2, i));
//			n = n / 10;
//		}
//		return dec;
//	}

}
//101 = 1*2^2+0*2^1+1*2^1