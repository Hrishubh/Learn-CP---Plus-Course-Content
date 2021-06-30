package Basic_Fundamentals_of_Programming;

import java.util.Arrays;

public class L4_TimeComplexity {

	public static void main(String[] args) {
		
		
//		System.out.println("---------Experimental_Analysis--------");
//		int[] arr = { 1, 0, 1, 1, 0, 0, 1, 1, 1 };
//		long start = System.currentTimeMillis();
//		Sort_0s_1s.solve(arr);
//		long end = System.currentTimeMillis();
//		
//		System.out.println(end - start);
//		System.out.println("---------------------------------------");
//		
//		System.out.println(polynomial(5, 3));
		
		SOE(13);
	}
	
	public static int polynomial(int x, int n) {
		
		int multiplier = x;
		int ans = 0;
		
		for(int coeff = n; coeff >= 1; coeff--) {
			ans = ans + (coeff * multiplier);
			multiplier = multiplier * x;
		}
		
		return ans;
	}
	
	public static void SOE(int n) {
		
		boolean primes[] = new boolean[n + 1];
		
		Arrays.fill(primes, true);
		
		primes[0] = false;
		primes[1] = false;
		
		for(int table = 2; table * table <= n; table++) {
			
			if(primes[table] == false) {
				continue;
			}
			
			for(int multiplier = 2; table * multiplier <= n; multiplier++) {
				
				primes[table * multiplier] = false;
			}
			
			
		}
		
		for(int i = 2;i <   primes.length; i++) {
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}

}
