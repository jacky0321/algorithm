package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class test022 {

	public static boolean isOk(String[] strings) {
		Stack<String> stack = new Stack<>();
		for(int i = 0 ; i < strings.length; i++) {
			if (strings[i] == "(") {
				stack.push("(");
			} else {
				if (stack.isEmpty()) {
					stack.push(")");
				} else {
					if (stack.peek() == "(") {
						stack.pop();
					}	
				}
			}
		}
		
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void exchange(String[] strings, int i, int j) {
		String s = strings[i];
		strings[i] = strings[j];
		strings[j] = s;
		
	}
	
	public static void main(String[] args) {
		String[] sssss = {"(", ")" ,"(", ")"};
		isOk(sssss);
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] strings = string.split(" ");
		int length = strings.length;
		boolean flag = false;
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = i + 1; j < length; j++) {
				exchange(strings, i, j);
				System.out.println(Arrays.toString(strings));

				if(isOk(strings)) {
					System.out.println("Yes");
					flag = true;
					break;
				}
				exchange(strings, j, i);
			}
		}
		
		if (flag == false) {
			System.out.println("No");
		}
	}
}
