package algorithm;

import java.util.Scanner;
/*
 * 计算最长回文子串长度
 */
public class test004 {
	public static int ps(char[] chars, int i, int j) {

		while (i >= 0 && j < chars.length && chars[i] == chars[j]) {
			i--;
			j++;
		}
		return j - i - 1;
	}
	
	public static int lps(String str) {
		char[] chars = str.toCharArray();
		int max = 1;
		
		for(int i = 0; i < chars.length; i++) {
			max = Math.max(max, ps(chars, i, i));
			max = Math.max(max, ps(chars, i, i+1)); 
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		int max = 1;
		for(int i = 0; i < string.length(); i++) {
			for(int j = i; j < string.length() + 1; j++) {
				max = Math.max(lps(string.substring(i, j)), max);
			}
		}
		
		System.out.println(max);
	}
}
