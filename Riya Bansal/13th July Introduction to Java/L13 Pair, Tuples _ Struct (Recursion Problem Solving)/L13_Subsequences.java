package Introduction_to_Programming_In_Java;

import java.util.ArrayList;

public class L13_Subsequences {

	public static void main(String[] args) {
		
		System.out.println(getSS("abc"));
		

	}

	private static ArrayList<String> getSS(String str) {
		
		if(str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		//smaller problem
		ArrayList<String> rr = getSS(ros);
		ArrayList<String> mr = new ArrayList<>();
		
		//self work
		for(String val: rr) {
			mr.add(val); //no
			mr.add(ch + val); // yes
			
		}
		
		return mr;
		
	}

}
