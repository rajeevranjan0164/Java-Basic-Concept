package StringProgram;

import java.util.HashMap;

public class Counter {
	
	public static void main(String[] args) {
		String str = "Programming";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] str1 = str.toCharArray();
		for (char ch : str1) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
