package algorithm;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class test017 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		NavigableMap<Integer,Integer> map2 = map.descendingMap();
		for(int i = 0; i < n; i++) {
			map.put(scanner.nextInt(), i);
		}
		
		int[] results = new int[n-k+1];
		

		//n-k+1
		for(int i = 0; i < 1; i++) {
			int min = map.firstKey();
			int max = map.lastKey();
			Iterator titer = map.entrySet().iterator();

			Iterator titer2 = map2.entrySet().iterator();

	        while(titer.hasNext()){  
	            Map.Entry entry = (Map.Entry)titer.next();  
	            Integer key = (Integer)entry.getKey();  
	            Integer value = (Integer)entry.getValue();
	            System.out.println(key + " " + value);
	            if (value >= i && value < i + k) {
	            	min = key;
	            	break;
	            }
	        } 
	        
	        while(titer2.hasNext()){  
	            Map.Entry entry = (Map.Entry)titer2.next();  
	            Integer key = (Integer)entry.getKey();  
	            Integer value = (Integer)entry.getValue();
	            if (value >= i && value < i + k) {
	            	max = key;
	            	break;
	            }
	            System.out.println(key + " " + value);
	        }
			results[i] = max - min;
		}
		
		for(int i = 0; i < results.length - 1; i++) {
			System.out.print(results[i] + " ");
		}
		System.out.print(results[results.length-1]);
	
	}
}

