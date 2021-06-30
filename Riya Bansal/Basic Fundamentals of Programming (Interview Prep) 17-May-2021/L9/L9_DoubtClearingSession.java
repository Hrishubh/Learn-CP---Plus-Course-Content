package Basic_Fundamentals_of_Programming;

public class L9_DoubtClearingSession {

	public static void main(String[] args) {
		
		//System.out.println(findMissingPositive(new int[] {3, 4, 1, 1, 1, 5, 1, 1, 2, 1}));
		//nextPermutation(new int[] {1, 5, 8, 4, 7, 6, 5, 3, 1});
		//pattern1(5);
		//pattern2(5);
		//pattern3(5);
		pattern4(7);
		
	}
	
	private static void pattern4(int n){
		
		int row = 1;
		int nst = n/2;
		int nsp = 1;
		
		while(row <= n) {
		
			//current row
			
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
		
			//spaces
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			//next row
			
			if(row <= n/2) {
				nst--;
				nsp +=2;
			}else {
				nst++;
				nsp -=2;
			}
			
			row++;
			System.out.println();
		}
		
	}
	
	private static void pattern3(int n){
		
		int row = 1;
		int nst = 1;
		
		
		while(row <= 2*n - 1) {
		
			//current row
			
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
		
			//next row
			row++;
			System.out.println();
			if(row <= n) {
				nst++;
			}else {
				nst--;
			}
		}
		
	}
	
	private static void pattern2(int n){
		
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while(row <= n) {
		
			//current row
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			//next row
			row++;
			System.out.println();
			nsp--;
			nst++;
			
		}
		
	}
	
	private static void pattern1(int n){
		
		int row = 1;
		int nst = 1;
		
		while(row <= n) {
		
			//current row
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			//next row
			nst++;
			System.out.println();
			row++;
		}
		
	}

	private static void nextPermutation(int[] nums) {
		
		int i = nums.length - 2;
		while(i >= 0 && nums[i + 1] <= nums[i]) {
			i--;
		}
		
		if(i >= 0) {
			int j = nums.length - 1;
			while(nums[j] <= nums[i]) {
				j--;
			}
			
			swap(nums, i, j);
		}
		
		reverse(nums, i + 1);
		
		for(int val: nums) {
			System.out.print(val + " ");
		}
		
	}

	private static void reverse(int[] nums, int s) {
		
		int i = s;
		int j = nums.length - 1;
		
		while(i <= j) {
			
			swap(nums, i, j);
			i++;
			j--;
		}
		
		
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}

	private static int findMissingPositive(int[] nums) {
		
		int n = nums.length;
		
		int contains = 0;
		for(int i = 0; i < n; i++) {
			if(nums[i] == 1) {
				contains++;
				break;
			}
		}
		
		if(contains == 0) {
			return 1;
		}
		
		for(int i = 0; i < n; i++) {
			if(nums[i] <= 0 || nums[i] > n) {
				nums[i] = 1;
			}
		}
	
		for(int i = 0; i < n; i++) {
			int a = Math.abs(nums[i]);
			
			if(a == n) {
				nums[0] = -Math.abs(nums[0]);
			}else {
				nums[a] = -Math.abs(nums[a]);
			}
		}
		
		for(int i = 1; i < n; i++) {
			if(nums[i] > 0) {
				return i;
			}
		}
		
		if(nums[0] > 0) {
			return n;
		}
		
		return -1;
	}

}
