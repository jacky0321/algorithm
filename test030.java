package algorithm;

import java.util.HashMap;

public class test030 {

	public static void main(String[] args) {
		char[] chars = {'a', 'a', 'c', 'a', 'b'};
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c: chars) {
//			if (map.get(c) == null) {
//				map.put(c, 1);
//			} else {
//				map.put(c, map.get(c) + 1);
//			}
			
//			map.put(c, map.getOrDefault(c, 0) + 1);
			map.compute(c, (k, v) -> v == null ? 1 : v + 1);
		}
		
		System.out.println(map);
	}
}
