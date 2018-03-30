package algorithm;

import java.util.Scanner;
/*
 * leetcode 
 */
public class test009 {
	public static int[] nums;
	
	public static int getMax(int idx) {
		if (idx < 0) {
			return 0;
		}
		return Math.max(nums[idx] + getMax(idx-2), getMax(idx-1));
				
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		nums = new int[length];
		
		for(int i = 0; i < length; i++) {
			nums[i] = scanner.nextInt();
		}
		
		System.out.println(getMax(nums.length - 1));
	}
}
