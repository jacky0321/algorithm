package algorithm;

import java.util.Scanner;

public class test016 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arrays = new int[n];
		for(int i = 0; i < n; i++) {
			arrays[i] = scanner.nextInt();
		}
		
		int[] results = new int[n-k+1];
		
		int j = 0;
		for(int i = 0; i < n-k+1; i++) {
			int min = arrays[i];
			int max = arrays[i];
			for(j = i; j < i + k; j++) {
				if (arrays[j] > max) {
					max = arrays[j];
				}else if (arrays[j] < min) {
					min = arrays[j];
				}
			}
			results[i] = max - min;
		}
		
		for(int i = 0; i < results.length - 1; i++) {
			System.out.print(results[i] + " ");
		}
		System.out.print(results[results.length-1]);
		
	}
}
