package javaExample;

public class SplitString {
	
	public static void main(String[] args)
	{
		
		String s = "Rajeev@Sanjeev@Rahul@Shyam";
		
		String[] s2 =s.split("@", 4);
		
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);
		
		for(int i =0; i<s2.length; i++)
		{
			System.out.println(s2[i]);
			
		}
		   
	}

}
