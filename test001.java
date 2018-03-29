package algorithm;

import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test001 {

	public static void getjobs() {
		Scanner scanner = new Scanner(System.in);
		
		int jobsNum = scanner.nextInt();
		int personsNum = scanner.nextInt();
		int[] jobsArray = new int[jobsNum + personsNum];
		int[] personsArray = new int[personsNum];
		Map<Integer, Integer> map = new HashMap<>();
		
		int m,n;
		for(int i = 0; i < jobsNum; i ++) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			jobsArray[i] = m;
			map.put(m, n);
		}
		
		int j;
		for(int i = 0; i < personsNum; i++) {
			j = scanner.nextInt();
			personsArray[i] = j;
			jobsArray[jobsNum + i] = j;
			if(!map.containsKey(j)) {
				map.put(j, 0);
			}
		}
		
		Arrays.sort(jobsArray);
		int max = 0;
		for(int i = 0; i < jobsArray.length; i ++) {
			max = Math.max(max, map.get(jobsArray[i]));
			map.put(jobsArray[i], max);
		}
		
		for(int i = 0; i < personsArray.length; i ++) {
			System.out.println(map.get(personsArray[i]));
		}
	}
	
	public static void getjobs2() {
		Scanner scanner = new Scanner(System.in);
		
		int jobsNum = scanner.nextInt();
		int personsNum = scanner.nextInt();
		int[] personsArray = new int[personsNum];
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		int m,n;
		for(int i = 0; i < jobsNum; i ++) {
			m = scanner.nextInt();
			n = scanner.nextInt();
			map.put(m, n);
		}
		
		int j;
		for(int i = 0; i < personsNum; i++) {
			j = scanner.nextInt();
			personsArray[i] = j;
			if(!map.containsKey(j)) {
				map.put(j, 0);
			}
		}


		int last = 0;
		int max = 0;
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			
			if (ent.getValue() == 0) {
				ent.setValue(max);
			}
			
			last = ent.getValue();
			if (last > max) {
				max = last;
			}
		}

		for(int i = 0; i < personsArray.length; i ++) {
			System.out.println(map.get(personsArray[i]));
		}
	}
	
	public static void main(String[] args) {
		getjobs2();
	}
}
