package StringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateString {

	public static void main(String[] args) {

		String s = "Rajeev";
		String s1 = removeDuplicate(s);
		System.out.println(s1);

	}

	public static String removeDuplicate(String str) {

		Set<Character> set = new HashSet<Character>();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			Character chr = str.charAt(i);
			if (!set.contains(chr)) {
				set.add(chr);
				stringBuffer.append(chr);
			}
		}
		return stringBuffer.toString();

	}
}
