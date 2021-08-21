package Introduction_to_Programming_In_Java_2;



public class L6_Reverse_An_Array {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			
			//swap
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			
			left++;
			right--;
		}
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}

}
