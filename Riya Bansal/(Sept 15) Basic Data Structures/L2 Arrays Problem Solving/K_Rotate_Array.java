package Basic_Data_Structures_Course;

public class K_Rotate_Array {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		int k = -14;
		
		int[] res = rotate(arr, k);
		
		for(int val: res) {
			System.out.print(val + " ");
		}
	}


	//TC - O(n)
	//SC - O(n)
	private static int[] rotate(int[] arr, int k) {
	
		//k = -28
		k = k % arr.length; //-3
		
		if(k < 0) {
			k = k + arr.length; //-3 + 5 => 2
		}
		
		int[] na = new int[arr.length];;
		
		for(int  i = 0; i < na.length; i++) {
			
			if(i < k) {
				na[i] = arr[i + arr.length - k]; 
			}else {
				na[i]  = arr[i - k]; 
			}
		}
		
		return na;
	}

}
