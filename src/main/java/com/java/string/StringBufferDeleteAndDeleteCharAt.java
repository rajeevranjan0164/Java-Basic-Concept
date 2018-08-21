package com.java.string;

public class StringBufferDeleteAndDeleteCharAt {
	
	public static void main (String[] args)
    {
        StringBuffer s=new StringBuffer("GeeksforGeeks");
        s.delete(0,5);
        System.out.println(s); //returns forGeeks
        s.deleteCharAt(7);
        System.out.println(s); //returns forGeek
    }

}
