package Introduction_to_Programming_In_Java;

public class L3_Prime {

	public static void main(String[] args) {
	
		int num = 5;
		
		boolean flag = true;
		
		for(int div = 2; div <= num / 2; div++) {
			//div -> 2, 3, 4
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
