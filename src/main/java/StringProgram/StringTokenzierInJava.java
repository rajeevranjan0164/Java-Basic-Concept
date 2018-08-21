package StringProgram;

import java.util.StringTokenizer;

//StringTokenzierInJava is used berak and split string into token
//Its Lagacy class
public class StringTokenzierInJava {

	public static void main(String[] args) {

		String s = "Hello world";
		// first I have split with default with space
		StringTokenizer stringTokenizer = new StringTokenizer(s);

		// here stringTokenizer.hasMoreTokens() true only than it will enter the loop
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());

		}

		String s1 = "Hello*world";
		

		//Here I have split with delimentar *
		StringTokenizer stringTokenizer1 = new StringTokenizer(s1, "*");

		// here stringTokenizer.hasMoreTokens() true only than it will enter the loop
		while (stringTokenizer1.hasMoreTokens()) {
			System.out.println(stringTokenizer1.nextToken());

		}
	}
}
