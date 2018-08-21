package com.java.string;

public class Append {

	public static void main(String[] args)
	{
		StringBuffer stringBuffer = new StringBuffer("Welcomefor");
		stringBuffer.append("raj"); //It is used to add text at the end of the existence text. Here are a few of its forms:
		System.out.println(stringBuffer);
		stringBuffer.append(1);
		System.out.println(stringBuffer);
	}
}
