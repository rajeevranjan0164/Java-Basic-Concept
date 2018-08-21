package StringProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseUsingCollection {
	
	public static void main(String[] args) {
		
		List<String> s1 = new ArrayList<String>();
		
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("e");
		Collections.reverse(s1);
		
		System.out.println(s1);
	}

}
