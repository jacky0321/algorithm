package algorithm;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class test024 {

	public static String modifySeq(char[] arrays) {
		String string = "";
		
		TreeMap<Character, Integer> map = new TreeMap<>();
		
		int maxCount = 1;
		int count = 0;
		for (int i = 0; i < arrays.length; i++) {
			char key = arrays[i];
			count = map.getOrDefault(key, 0) + 1;
			maxCount = Math.max(maxCount, count); 
			map.put(key, count);
		}
		
		for (int i = 0; i < maxCount; i++) {
			for (Entry<Character, Integer> entry : map.entrySet()) {
				char key = entry.getKey();
				int value = entry.getValue();
						
				if (value > 0) {
					string += key;
					value--;
					map.put(key, value);
				}
			}
		}
		
		return string;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] arrays = string.toCharArray();
		
		System.out.println(modifySeq(arrays));
	}
}
