package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。
 * 如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。
 * 请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。
 * 
 * 输入描述:
 * 输入包括五行。
 * 第一行包括一个整数n(2 <= n <= 50), 表示矩形的个数。
 * 第二行包括n个整数x1[i](-10^9 <= x1[i] <= 10^9),表示左下角的横坐标。
 * 第三行包括n个整数y1[i](-10^9 <= y1[i] <= 10^9),表示左下角的纵坐标。
 * 第四行包括n个整数x2[i](-10^9 <= x2[i] <= 10^9),表示右上角的横坐标。
 * 第五行包括n个整数y2[i](-10^9 <= y2[i] <= 10^9),表示右上角的纵坐标。
 * 
 * 输出描述:
 * 输出一个正整数, 表示最多的地方有多少个矩形相互重叠,如果矩形都不互相重叠,输出1。
 */
public class test002 {

	public static void method1() {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x1 = new int[n];
		int[] x2 = new int[n];
		int[] y1 = new int[n];
		int[] y2 = new int[n];
		ArrayList<Integer> xList = new ArrayList<>();
		ArrayList<Integer> yList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			x1[i] = scanner.nextInt();
			xList.add(x1[i]);
		}

		for (int i = 0; i < n; i++) {
			y1[i] = scanner.nextInt();
			yList.add(y1[i]);
		}

		for (int i = 0; i < n; i++) {
			x2[i] = scanner.nextInt();
			xList.add(x2[i]);
		}

		for (int i = 0; i < n; i++) {
			y2[i] = scanner.nextInt();
			yList.add(y2[i]);
		}

		int res = 1;
		for (int x : xList) {
			for (int y : yList) {
				int curt = 0;
				for (int i = 0; i < n; i++) {
					if (x > x1[i] && y > y1[i] && x <= x2[i] && y <= y2[i]) {
						curt++;
					}
				}
				if (curt > res) {
					res = curt;
				}
			}
		}

		System.out.println(res);

	}

	public static void method2() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] x1 = new int[n];
		int[] x2 = new int[n];
		int[] y1 = new int[n];
		int[] y2 = new int[n];
		ArrayList<Integer> xList = new ArrayList<>();
		ArrayList<Edge> edges = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			x1[i] = scanner.nextInt();
			xList.add(x1[i]);
		}

		for (int i = 0; i < n; i++) {
			y1[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			x2[i] = scanner.nextInt();
			xList.add(x2[i]);
		}

		for (int i = 0; i < n; i++) {
			y2[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			edges.add(new Edge(x1[i], x2[i], y1[i], 1));
			edges.add(new Edge(x1[i], x2[i], y2[i], -1));
		}

		Collections.sort(edges);
		Collections.sort(xList);

		ArrayList<Integer> counter = new ArrayList<>();
		for (int i = 0; i <= 2 * n; i++) {
			counter.add(i, 0);
		}

		int res = 1;
		for (Edge e : edges) {
			Integer index = xList.indexOf(e.left);
			Integer rightIndex = xList.indexOf(e.right);
			while (index < rightIndex) {
				counter.set(index, counter.get(index) + e.value);
				if (counter.get(index) > res) {
					res = counter.get(index);
				}
				index++;
			}
		}

		System.out.println(res);
	}

	public static void main(String[] args) {
//		method1();
		method2();
	}
}

class Edge implements Comparable<Edge> {
	public int left;
	public int right;
	public int height;
	public int value;

	public Edge(int left, int right, int height, int value) {
		this.left = left;
		this.right = right;
		this.height = height;
		this.value = value;
	}

	@Override
	public int compareTo(Edge o) {
		return Integer.compare(this.height, o.height);
	}

}
