package StringProgram;

public class ConvertCharArray {
	
	public static void main(String[] args) {
		
		String s = "hello how are you";
		
		char[] s1 = s.toCharArray();
		
		for(char c : s1)
		{
			System.out.println(c);
		}
	}

}
