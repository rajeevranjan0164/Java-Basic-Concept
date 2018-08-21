package StringProgram;

public class LetterCount {
	
	
	public static int letterCount(String str)
	{
		return str.length()-str.split(" ").length+1;
		
	}
	
	public static void main(String[] args) {
		
		String str  = "Rajeev";
		int l = letterCount(str);
		System.out.println(l);
	}

}
