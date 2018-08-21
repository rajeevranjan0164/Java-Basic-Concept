package StringProgram;

public class SearchStringDemo {
	
	public static void main(String[] args)
	{
		String original = "Welcome to hello world";
		String searchString = "Welcome";
		
		boolean s1 = original.contains(searchString);
		String searchString1 = "the";
		boolean s2 = original.contains(searchString1);
		System.out.println(s1);
		System.out.println(s2);
	}

}
