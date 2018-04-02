package algorithm;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 6
30
35
15
5
10
20
25
 */
public class test012 {

	private static int[][] m;
	private static int[] p;
	private static int MAX = Integer.MAX_VALUE;
	private static int[] s;	
	private static int length;
	
	public static void getInput() {
		Scanner scanner = new Scanner(System.in);
		length = scanner.nextInt();
		p = new int[length+1];
		m = new int[length+1][length+1];
		s = new int[length];
		
		for(int i = 0; i < length + 1; i++) {
			p[i] = scanner.nextInt();
			m[i][i] = 0;
		}
	}
	
	public static void countMin() {
		for (int d = 1; d < length; d++) {
			for (int i = 0; i < length - d; i ++) {
				int j = i + 1;
			}
		}
		
		System.out.println(m[0][length-1]);
	}
	
	public static boolean name(int x) {
		String string = String.valueOf(x);
		char[] chars = string.toCharArray();
		boolean flag = true;
		for(int i = 0; i < chars.length/2; i++) {
			if (chars[i] != chars[chars.length - i - 1]) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args){
	
//		getInput();
//		countMin();
		
		System.out.println(name(121221));
	}
}
