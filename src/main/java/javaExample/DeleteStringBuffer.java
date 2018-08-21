package javaExample;

public class DeleteStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "Sarajeevnjeev";
		
		StringBuffer s1 = new StringBuffer(city);
		
		
		StringBuffer s2 = s1.delete(2, 8);
		System.out.println(s2);
		

	}

}
