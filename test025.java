package algorithm;

import java.util.Scanner;

public class test025 {

	public static char[] multiply(char[] chars1, char[] chars2) {
		int chars1Length = chars1.length;
		int chars2Length = chars2.length;
		int totalLength = chars1Length + chars2Length;
		
		int[] middle = new int[totalLength];
		char[] results = new char[totalLength + 1];

		for (int i = 0; i < chars1Length; i++) {
			for (int j = 0; j < chars2Length; j++) {
				middle[i + j + 1] += (chars1[i] - '0') * (chars2[j] - '0');
			}
		}
		
		for (int i = totalLength - 1; i > 0; i--) {
			if (middle[i] >= 10) {
				middle[i - 1] += middle[i] / 10;
				middle[i] %= 10;
			}
		}
		
		int counter = 0;
		
		while (middle[counter] == 0) {
			counter++;
		}
		
		for (int index = 0; counter < totalLength; counter++) {
			results[index] = (char) (middle[counter] + '0');
			index++;
		}
		
		return results;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] chars1 = scanner.nextLine().toCharArray();
		char[] chars2 = scanner.nextLine().toCharArray();

		char[] chars = multiply(chars1, chars2);
		
		for(char c: chars) {
			System.out.print(c);
		}
	}
}
