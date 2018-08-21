package StringProgram;

import java.util.HashSet;
import java.util.Set;

public class ToRemoveDuplicateCharactersFromAstring {
	
	public static void main(String[] args) {
		
		String s = "aaaabbbvffokfkofd";
		char[] ch1 =s.toCharArray();
		Set<Character> setchar = new HashSet<Character>();
		
		for(char c : ch1)
		{
			setchar.add(c);
			//System.out.println(setchar.size());
		}
		
		StringBuffer stringBuffer = new StringBuffer();
		for(Character c1 : setchar)
		{
			
			stringBuffer.append(c1);
			
		}
		
		System.out.println(stringBuffer.toString());
		
		
		
	}
	
	
	

}
