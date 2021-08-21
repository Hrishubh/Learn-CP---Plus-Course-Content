package Introduction_to_Programming_In_Java;

public class L12_StringBuilderDemo {

	public static void main(String[] args) {
		
		String str = "hello";
		
		//string to stringbuilder
		StringBuilder sb = new StringBuilder(str);

		//length
		System.out.println(sb.length());
		
		//charAt
		System.out.println(sb.charAt(2));
		
		//insert
		sb.insert(0, 'g'); //inserting at the specificied index
		sb.append('a'); //adding to the end
		System.out.println(sb);
		
		//update
		sb.setCharAt(2, 's');
		System.out.println(sb);
		
		//remove
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//convert stringbuilder to string
		String s = sb.toString();
		System.out.println(s);
	}

}
