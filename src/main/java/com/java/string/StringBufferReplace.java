package com.java.string;

public class StringBufferReplace {
	
	public static void main (String[] args)
    {
        StringBuffer s=new StringBuffer("GeeksforGeeks");
        s.replace(5,8,"the");
        System.out.println(s); //returns GeeksareGeeks
    }

}
