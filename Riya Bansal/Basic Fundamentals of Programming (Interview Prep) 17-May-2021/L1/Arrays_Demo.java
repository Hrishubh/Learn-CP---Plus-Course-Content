package Basic_Fundamentals_of_Programming;

import java.util.Arrays;

public class Arrays_Demo {

	public static void main(String[] args) {
		
		int[] arr;
		
		//Array of size 5 has been created. 
		arr = new int[5];
		
		int[] newArr = {1, 2, 3, 4, 5};
		
		Arrays.sort(arr);
		
		System.out.println(arr);
		
		System.out.println(arr.length);
		
		//get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		
		//set
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		//loop
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//enhanced for loop
		//reading values
		for(int val: arr) {
			System.out.print(val + " ");
		}
		
	}

}
