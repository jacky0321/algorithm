package algorithm;

import java.util.Scanner;
/*
 * ţţ��ǰ����ʦ����õ���һ������������(x, y), ţţ�������Ǿ����Ƕ����ˡ�
 * ����ţţ�ǵ���ʦ���߹���x��y��������n, ����x����y���������ڵ���k��
 * ţţϣ�����ܰ�������һ���ж��ٸ����ܵ����ԡ�
 * 
 * ��������:
 * �����������������n,k(1 <= n <= 10^5, 0 <= k <= n - 1)��
 * 
 * �������:
 * ����ÿ����������, ���һ����������ʾ���ܵ�����������
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
