package algorithm;

import java.util.Scanner;

public class test026 {

	public static long searchTreeCount(int n) {
		if (n <= 1) {
			return 1;
		}
		
		long count = 0;
		for(int i = 0; i < n; i++) {
			count += searchTreeCount(i) * searchTreeCount(n - 1 - i);
		}
		
		return count;
		
	}
	
	
	public static long searchTreeCountDP(int n) {
		long[] counter = new long[n+1];
		
		for(int i = 0; i < 2; i++) {
			counter[i] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				counter[i] += counter[j] * counter[i-1-j];
			}
		}
		
		return counter[n];
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long start = System.currentTimeMillis();
		System.out.println(searchTreeCountDP(n));
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms");
		System.out.println(searchTreeCount(n));
		long fin = System.currentTimeMillis();
		System.out.println(fin - end + " ms");
	}
}
