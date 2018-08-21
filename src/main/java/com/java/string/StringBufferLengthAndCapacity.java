package com.java.string;

public class StringBufferLengthAndCapacity {
	
	public static void main(String[] args)
	{
		StringBuffer stringBuffer = new StringBuffer("Hello how are you");
		int len = stringBuffer.length(); //The length of a StringBuffer can be found by the length( ) method
		int cap = stringBuffer.capacity(); //while the total allocated capacity can be found by the capacity( ) method.
		System.out.println(len);
		System.out.println(cap);
	}

}
