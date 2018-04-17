package algorithm;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class test029 {

	public static boolean isOut(int w, int h, int currentx, int currenty) {
		return 1 <= currentx && currentx <= w && 1 <= currenty && currenty <= h ;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char[] arraysChar = scanner.nextLine().toCharArray();
		int n = Integer.valueOf(scanner.nextLine());
		int[][] arrays = new int[n][4];

		for (int i = 0; i < n; i++) {
			String[] arrs = scanner.nextLine().split(" ");

			for (int j = 0; j < 4; j++) {
				arrays[i][j] = Integer.valueOf(arrs[j]);
			}
		}


		for (int i = 0; i < n; i++) {
			int w = arrays[i][1];
			int h = arrays[i][0];
			int y = arrays[i][2];
			int x = arrays[i][3];
			int currentx = x;
			int currenty = y;
			int count = 0;

			boolean flag = false;
			for (char c : arraysChar) {
				
				if (c == 'u') {
					currenty--;
				} else if (c == 'd') {
					currenty++;
				} else if (c == 'r') {
					currentx++;
				} else if (c == 'l') {
					currentx--;
				}
				
				if (isOut(w, h, currentx, currenty)) {
					count++;
				} else {
					count++;
					System.out.println(count);
					flag = true;
					break;
				}				
			}
			if (!flag) {
				System.out.println(count);
			}
		}
	}
}
