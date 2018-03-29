package algorithm;

import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * 为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。
 * 牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。
 * 在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。
 * 牛牛的小伙伴太多了，于是他只好把这个任务交给了你。 
 * 
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
 * 接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
 * 接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
 * 保证不存在两项工作的报酬相同。
 * 
 * 输出描述:
 * 对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
 */
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
