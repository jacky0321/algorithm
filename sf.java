package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class sf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = Integer.parseInt(sc.nextLine());

		String string1 = sc.nextLine();
		String[] ww = string1.split(" ");
		String string2 = sc.nextLine();
		String[] vv = string2.split(" ");

		int weight[] = new int[ww.length];
		int val[] = new int[vv.length];

		for (int i = 0; i < weight.length; i++) {
			weight[i] = Integer.parseInt(ww[i]);
			val[i] = Integer.parseInt(vv[i]);
		}

		int n = val.length; // 物品个数

		int[][] f = new int[n + 1][m + 1]; // f[i][j]表示前i个物品能装入容量为j的背包中的最大价值
		int[][] path = new int[n + 1][m + 1];
		// 初始化第一列和第一行
		for (int i = 0; i < f.length; i++) {
			f[i][0] = 0;
		}
		for (int i = 0; i < f[0].length; i++) {
			f[0][i] = 0;
		}
		// 通过公式迭代计算
		for (int i = 1; i < f.length; i++) {
			for (int j = 1; j < f[0].length; j++) {
				if (weight[i - 1] > j)
					f[i][j] = f[i - 1][j];
				else {
					if (f[i - 1][j] < f[i - 1][j - weight[i - 1]] + val[i - 1]) {
						f[i][j] = f[i - 1][j - weight[i - 1]] + val[i - 1];
						path[i][j] = 1;
					} else {
						f[i][j] = f[i - 1][j];
					}
				}
			}
		}

		Stack<Integer> stack = new Stack<>();

		int i = f.length - 1;
		int j = f[0].length - 1;
		while (i > 0 && j > 0) {
			if (path[i][j] == 1) {
				stack.push(i);
				j -= weight[i - 1];
			}
			i--;
		}

		
		while (stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		
	}

}
