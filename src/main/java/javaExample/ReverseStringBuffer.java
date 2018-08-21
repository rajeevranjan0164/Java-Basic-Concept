package javaExample;

public class ReverseStringBuffer {
	
	public static void main(String[] args)
	{
		
		String name = "Rajeev Ranjan";
		
		StringBuffer s1 = new StringBuffer(name);
		
		StringBuffer s2 = s1.reverse();
		
		System.out.println(""+name);
		
		System.out.println(""+s2);
		
	}

}
