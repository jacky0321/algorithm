package algorithm;

import java.util.Scanner;



public class test023 {

	public static int count(int[] arrays) {
		if (arrays.length <= 0) {
			return 0;
		}
		if (arrays.length == 1) {
			return 0;
		}

		int index = 0;
		int temp = 0;
		int counter = 0;

		while (index <= arrays.length - 1) {
			
			if (index + arrays[index] >= arrays.length - 1) {
				counter++;
				return counter;
			}
			
			int oop = 0;
			
			for (int i = index + 1; i <= index + arrays[index]; i++) {
				if (oop < i + arrays[i]) {
					oop = i + arrays[i];
					temp = i;
				}
			}
			
			index = temp;
			counter++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arrays = new int[n];
		for (int i = 0; i < n; i++) {
			arrays[i] = in.nextInt();
		}

		System.out.println(count(arrays));

	}
}