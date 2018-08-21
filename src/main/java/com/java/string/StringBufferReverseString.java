package com.java.string;

public class StringBufferReverseString {
	
	public static void main (String[] args)
    {
        StringBuffer s=new StringBuffer("the world is the most common for all country it is "
        		+ "the power full usa");
        s.reverse(); //It can reverse the characters within a StringBuffer object using reverse( ).This method returns the reversed object on which it was called.
        System.out.println(s); //returns jaR
        }

}
