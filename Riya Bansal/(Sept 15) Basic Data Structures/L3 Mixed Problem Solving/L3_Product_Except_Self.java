package Basic_Data_Structures_Course;

public class L3_Product_Except_Self {

	public static void main(String[] args) {
		
		int[] res = productExceptSelf(new int[] {4, 5, 1, 8, 2});
		
		for(int val: res) {
			System.out.print(val + " ");
		}

	}

	private static int[] productExceptSelf(int[] arr) {
		
		int length = arr.length;
		
		int[] L = new int[length];
		int[] R = new int[length];
		
		int[] answer = new int[length];
		
		L[0] = 1;
		for(int i = 1; i < length; i++) {
			
			L[i] = arr[i - 1] * L[i - 1];
		}
		
		R[length - 1] = 1;
		for(int i = length - 2; i >= 0; i--) {
			R[i] = arr[i + 1] * R[i + 1]; 
		}
		
		for(int i = 0; i < length; i++) {
			
			answer[i] = L[i] * R[i];
		}
		
		return answer;
	}

}
