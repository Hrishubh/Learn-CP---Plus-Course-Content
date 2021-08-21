package Introduction_to_Programming_In_Java_2;

public class L3_Prime {

	public static void main(String[] args) {
		
		int num = 10;
		boolean flag = true;
		
		for(int div = 2; div <= num - 1; div++) {
			
			int rem = num % div;
			
			if(rem == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("PRIME");
		}else {
			System.out.println("NOT PRIME");
		}

	}

}
