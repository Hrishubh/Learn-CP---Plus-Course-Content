package Introduction_to_Programming_In_Java_2;

public class L17_Product_Except_Self {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 1, 8, 2 };

		int[] res = find(arr);

		for (int val : res) {
			System.out.println(val);
		}
	}

	private static int[] find(int[] arr) {

		int length = arr.length;

		int[] answer = new int[length];

		int[] L = new int[length];
		int[] R = new int[length];

		L[0] = 1;
		for (int i = 1; i < length; i++) {

			L[i] = arr[i - 1] * L[i - 1];
		}

		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			R[i] = arr[i + 1] * R[i + 1];
		}

		for (int i = 0; i < length; i++) {

			answer[i] = L[i] * R[i];
		}
		
		return answer;
	}

}
