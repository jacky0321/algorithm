package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * 最多有多少个矩形覆盖问题
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
