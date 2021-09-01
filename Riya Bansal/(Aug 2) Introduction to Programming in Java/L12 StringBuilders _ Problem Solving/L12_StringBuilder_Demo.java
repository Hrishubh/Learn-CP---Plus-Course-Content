package Introduction_to_Programming_In_Java_2;



public class L12_StringBuilder_Demo {

	public static void main(String[] args) {
		
		String str = "hello";
		
		//string to stringBuilder
		StringBuilder sb = new StringBuilder(str);
		
		//length
		System.out.println(sb.length());
		
		//charAt
		System.out.println(sb.charAt(2));
		
		//insert
		sb.insert(0, 'g'); //inserting at the specified index
		sb.append('a'); //adding at the end
		System.out.println(sb);
		
		//update
		sb.setCharAt(2, 's');
		System.out.println(sb);
		
		//remove
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//convert stringBuilder to string
		String s = sb.toString();
		System.out.println(s);
	}

}
