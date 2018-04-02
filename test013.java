package algorithm;

import java.util.Scanner;

public class test013 {

	private static int start = 0;
	private static int end = 0;
	private static char c;
	private static char[] chars;
	private static int count = 0;
	private static int n = 0;
	private static String str;
	
	public static void main(String[] args) {
		getInput();
		getSubString();
	}
	
	public static void getSubString() {
		for (int i = 0; i < chars.length; i++) {
			if (c == chars[i]) {
				end++;
				count++;
			}else {
				if (count == n) {
					System.out.println("(" + (start + 1)+ "," + end + ")" + " " + str.substring(start, end));
				}
				
				start = i;
				end = i + 1;
				c = chars[i];
				count = 1;
			}
		}
		
		if (count == n) {
			System.out.println("(" + (start + 1)+ "," + end + ")" + " " + str.substring(start, end));
		}
	}
	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
		str = scanner.nextLine();
		
		
		chars = str.toCharArray();
		c = chars[0];
		n = scanner.nextInt(); 
	}

}
