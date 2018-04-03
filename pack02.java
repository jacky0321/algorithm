package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class pack02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = Integer.valueOf(scanner.nextLine());
		String[] ww = scanner.nextLine().split(" ");
		String[] vv = scanner.nextLine().split(" ");
		int[] weight = new int[ww.length];
		int[] value = new int[vv.length];
		
		for (int i = 0; i < weight.length; i++) {
			weight[i] = Integer.parseInt(ww[i]);
		}
		
		for (int i = 0; i < value.length; i++) {
			value[i] = Integer.parseInt(vv[i]);
		}

		int[] results = pack(size, weight, value);
		
		Arrays.sort(results);
		
		Set<Integer> sets = new HashSet<>();
		for (int i = 0; i < results.length; i++) {
			if (results[i] != 0)
				sets.add(results[i]);
		}
		Iterator<Integer> iterator = sets.iterator();
		
		String str = "";
		while (iterator.hasNext()) {
			str += iterator.next() + " ";
		}
		
		str = str.substring(0, str.length() - 1);
		System.out.print(str);
	}

	public static int[] pack(int c, int[] weight, int[] value) {
		int[] result = new int[weight.length];
		int n = weight.length;
		int[] w = new int[n + 1];
		int[] v = new int[n + 1];
		int[][] G = new int[n + 1][c + 1];
		for (int i = 1; i < n + 1; i++) {
			w[i] = weight[i - 1];
			v[i] = value[i - 1];
		}

		int[] values = new int[c + 1];

		for (int i = 1; i < n + 1; i++) {
			for (int t = c; t >= w[i]; t--) {
				if (values[t] < values[t - w[i]] + v[i]) {
					values[t] = values[t - w[i]] + v[i];
					G[i][t] = 1;
				}
			}
		}

		int i = n;
		int j = c;
		int yuansu = 0;
		while (i > 0) {
			if (G[i][j] == 1) {

				result[yuansu++] = i;
				j -= w[i];
			}
			i--;
		}
		return result;

	}

}
