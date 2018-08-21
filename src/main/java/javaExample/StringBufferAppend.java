package javaExample;

public class StringBufferAppend {
	
	public static void main(String[] args)
	{
		
		String name = "Sanjeev";
		
		StringBuffer s = new StringBuffer(name);
		
		StringBuffer s2 =  s.append(" kumar");
		
		
		System.out.println(s2);
	}

}
