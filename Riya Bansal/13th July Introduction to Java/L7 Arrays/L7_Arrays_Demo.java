package Introduction_to_Programming_In_Java;

public class L7_Arrays_Demo {

	public static void main(String[] args) {

		// No actual array exists as of now. No memory has been
		// allocated to arr in the RAM
		int[] arr;

		arr = new int[5];

		System.out.println(arr);

		// length
		System.out.println(arr.length);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		System.out.println("-------------------");

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// enhanced for loop
		// only for reading the values from array

		System.out.println();
		for (int val : arr) {
			System.out.println(val + " ");
		}

	}

}
