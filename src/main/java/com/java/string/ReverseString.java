package com.java.string;

public class ReverseString {

	public static void main(String[] args) {

		String str1 = "Hello";

		StringBuffer stringBuffer = new StringBuffer();

		StringBuffer str2 = stringBuffer.append(str1).reverse();
		
		System.out.println(str2);

		for (int i = 0; i < str2.length(); i++) {

			System.out.println(str1.charAt(i));

		}

	}

}