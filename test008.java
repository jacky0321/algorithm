package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/*
 * ¾ØÕóË³Ê±ÕëĞı×ª90¡ã¡¢×ªÖÃ
 */

public class test008 {
	
	public static void rotArray(String[][] arrays, int m) {
		String[][] res = new String[m][m];

		for(int i = 0; i < m; i ++) {
			for(int j = 0; j < m; j ++) {
				res[i][j] = arrays[m - j - 1][i];
			}
		}
		
		for(int i = 0; i < m; i ++) {
			for(int j = 0; j < m; j ++) {
				System.out.print(res[i][j]);
				if(j != m - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] arr = null;
		
		String string = scanner.nextLine();
		
		arr = string.split(" ");
		int m = arr.length;
		String[][] arrays = new String[m][m];
		arrays[0] = arr;

		for(int i = 1; i < m; i++) {
			arrays[i] = scanner.nextLine().split(" ");
		}
		
		rotArray(arrays, m);
		
	}
}
