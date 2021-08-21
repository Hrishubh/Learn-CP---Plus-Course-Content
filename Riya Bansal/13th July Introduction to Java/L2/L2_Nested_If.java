package Introduction_to_Programming_In_Java;

public class L2_Nested_If {

	public static void main(String[] args) {
		
		int age = 40;
		
		int weight = 49;
		
		if(age >= 18) {
			
			if(weight > 50) {
				System.out.println("You are eligible to donate blood.");
			}else {
				System.out.println("Not enough weight");
			}
		}else {
			System.out.println("You are not eligible to donate blood");
		}

	}

}
