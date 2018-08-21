package StringProgram;

public class ReverseStringWithoutAnyFuncation {
	
	public static void main(String[] args) {
		
		String s = "Sanjeev";
		char[] s1 = s.toCharArray();
		
		for(int i=s1.length-1; i>=0;i--)		{
			System.out.println(s1[i]);
		}
	}

}
