package com.java.string;

public class StringTokenizer {
	
	public StringTokenizer(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
    {
        System.out.println("Using Constructor 1 - ");
        StringTokenizer st1 =
             new StringTokenizer("Hello Geeks How are you", " ");
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());
 
        System.out.println("Using Constructor 2 - ");
        StringTokenizer st2 = 
             new StringTokenizer("JAVA : Code : String", " :");
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());
 
        System.out.println("Using Constructor 3 - ");
        StringTokenizer st3 = 
             new StringTokenizer("JAVA : Code : String", " :",  true);
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }

}
