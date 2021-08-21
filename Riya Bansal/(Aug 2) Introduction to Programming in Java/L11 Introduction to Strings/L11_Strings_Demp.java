package Introduction_to_Programming_In_Java_2;

import java.util.Scanner;

public class L11_Strings_Demp {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// int n = scn.nextInt();

		// String str = scn.nextLine();

		String str = "hello";

		// Part 1: Length of string
		System.out.println(str.length());

		// Part 2: Char At (0 -> length - 1)
		char ch = str.charAt(0);
		System.out.println(ch);

		System.out.println(str.charAt(str.length() - 1));

		System.out.println("------------------");

		str = "hello";

		// Part 3: substring
		// substring(2, 5) - [2, 4]
		
		System.out.println(str.substring(2, 4)); //ll
		System.out.println(str.substring(3, 4)); //l
		System.out.println(str.substring(3, 3)); //blank
		System.out.println(str.substring(0, 5)); //hello
		System.out.println(str.substring(3)); //lo
		//System.out.println(str.substring(4, 2)); //error
		
		//Part 4: Concatenation
		
		String s1 = "hi";
		String s2 = "bye"; 
		String s3 = s1 + s2; //hibye
		
		System.out.println(s1 + ", "+  s2 + ", " + s3);
		String s4 = s1.concat(s2); //
		System.out.println(s1 + ", "+  s2 + ", " + s4);
		
		System.out.println("-------------------");
		
		//Part 5: Index Of
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("eL"));
		
		System.out.println("-------------------");
		
		//Part 6: Starts with
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));
		
		System.out.println("-----------------");
		
		//Part 7: Immutability
		
		String s = "Sahil";
		s.concat("Sharma");
		System.out.println(s);
		
		//Part 8: Replace With
		str = str.replace('l', 't');
		System.out.println(str);
		
		String string = String.format("name is %f", 114.132124);
		System.out.println(string);
	}

}
