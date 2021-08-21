package Introduction_to_Programming_In_Java_2;

public class L6_Max_Value_In_Array {

	public static void main(String[] args) {
		
		int[] arr = {10, 2, 33, 290, 50};
		
		int max = Integer.MIN_VALUE;
	
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}
	
}
