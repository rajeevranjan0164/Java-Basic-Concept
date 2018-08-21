package StringProgram;

public class StringBufferAppendCharDemo {
	
	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello World");
		
		StringBuffer s1 = stringBuffer.append('!');
		
		System.out.println(s1);
	}

}
