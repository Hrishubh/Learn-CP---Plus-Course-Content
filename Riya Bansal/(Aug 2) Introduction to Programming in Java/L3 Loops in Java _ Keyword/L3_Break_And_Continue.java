package Introduction_to_Programming_In_Java_2;

public class L3_Break_And_Continue {

	public static void main(String[] args) {
		
		//Break
//		for(int i = 1; i <= 10; i++) {
//			
//			if(i == 5) {
//				break;
//			}
//			
//			System.out.println(i);
//		}
		
		//Continue
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
