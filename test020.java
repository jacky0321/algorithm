package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class test020 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.valueOf(scanner.nextLine());
		
		HashSet<String> hashSet = new HashSet<String>();
		
		for(int i = 0; i < n; i++){
			String line = scanner.nextLine();
			String[] strings = line.split(" ");

			int k = Integer.valueOf(strings[0]);
			System.out.println(Arrays.toString(strings));
			for(int j = 1; j < strings.length; j++){
				hashSet.add(strings[j]);
			}
		}
			
	}

}
