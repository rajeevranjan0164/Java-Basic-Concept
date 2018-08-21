package javaExample;

public class InsertStringBuffer {
	
	public static void main(String[] args)
	{
		
		String name= "sanjeev";
		StringBuffer s1 = new StringBuffer(name);
		
		StringBuffer s2 = s1.insert(7, " kumar");
		
		System.out.println(s2);
		
	}

}
