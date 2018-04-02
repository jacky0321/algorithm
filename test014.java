package algorithm;

import java.util.Scanner;

public class test014 {

	public static int[] ints;
	public static int n;
	
	public static void main(String[] args) {
		getInput();
		getMax();
	}
	
	public static void getMax() {
		int max = 0;
		for (int i = 0; i < ints.length; i++) {
			for(int j = i; j < ints.length; j++) {
				
				int temp = 0;
				for (int k = i; k <= j; k++) {
					temp += ints[k];
				}
				max = Math.max(max, temp);
			}
		}
		System.out.println(max);
	}
	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		ints = new int[n];
		
		for (int i = 0; i < ints.length; i++) {
			ints[i] = scanner.nextInt();
		}
		scanner.close();
	}
}
