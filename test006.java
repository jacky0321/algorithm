package algorithm;

import java.util.Scanner;

public class test006 {
	public static void num() {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int n = scanner.nextInt();
		int res = 0;
		long sum = 0;
		for(long i = r; i <= n; i ++) {
			sum = (i + 1) * i / 2;
			if(sum % 3 == 0) {
				res ++;
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		num();
	}
}
