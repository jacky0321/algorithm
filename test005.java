package algorithm;

import java.util.Scanner;
/*
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。
 * 但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
 * 牛牛希望你能帮他计算一共有多少个可能的数对。
 * 
 * 输入描述:
 * 输入包括两个正整数n,k(1 <= n <= 10^5, 0 <= k <= n - 1)。
 * 
 * 输出描述:
 * 对于每个测试用例, 输出一个正整数表示可能的数对数量。
 */
public class test005 {

	public static void getNum(int n, int k) {
		/*
		 * 10000 2 99812689 0.218
		 * 
		 * 100000 2 1407731944 20.342
		 */

		int result = 0;

		for (int w = n - k; w >= 0; w--) {
			result += w;
		}

		for (int i = 2 * k + 1; i <= n; i++) {
			for (int j = k + 1; j <= i; j++) {
				if (i % j >= k) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

	public static void getNum2(int n, int k) {
		int result = 0;
		for (int y = k + 1; y <= n; y++) {
			for (int x = k; x <= n; x += y) {
				result += Math.min(n - x + 1, y - k);
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
//		long start = System.currentTimeMillis();
//		getNum2(n, k);
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + " ms");
	}
}
