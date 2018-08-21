package StringProgram;

public class StringInternDemo {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		
		//it will cerate new object every time
		String str2 = new String("Hello");
		
		//using intern it won't create new object
		System.out.println(str1==str2);
		
		String str3= str2.intern();
		
		System.out.println(str1==str3);
		
	}

}
