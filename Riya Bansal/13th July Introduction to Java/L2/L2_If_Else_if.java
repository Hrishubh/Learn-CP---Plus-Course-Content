package Introduction_to_Programming_In_Java;


public class L2_If_Else_if {

	public static void main(String[] args) {
		
		int marks = 99;
		
		if(marks >= 0 && marks < 33) {
			System.out.println("Student failed");
		}else if(marks >= 33 && marks < 60){
			System.out.println("D Grade");
		}else if(marks >= 60 && marks < 70) {
			System.out.println("C Grade");
		}else if(marks >= 70 && marks < 80) {
			System.out.println("B Grade");
		}else if(marks >= 80 && marks <= 100) {
			System.out.println("A Grade");
		}else {
			System.out.println("Invalid Marks Entered.");
		}

	}

}
