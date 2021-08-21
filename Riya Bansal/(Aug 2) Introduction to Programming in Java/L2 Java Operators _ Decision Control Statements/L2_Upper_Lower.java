package Introduction_to_Programming_In_Java_2;

public class L2_Upper_Lower {

	public static void main(String[] args) {
		
		char ch = '$';
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper");
		}else {
			System.out.println("Invalid");
		}

	}

}
