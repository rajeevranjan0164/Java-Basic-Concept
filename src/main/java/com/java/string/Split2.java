package com.java.string;

public class Split2 {
	
	public static void main(String args[])
    {
        String str = "GeeksforGeeks:A Computer Science Portal";
        String [] arrOfStr = str.split(":");
 
        for (String a : arrOfStr)
            System.out.println(a);
    }

}
