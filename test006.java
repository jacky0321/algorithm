package algorithm;

import java.util.Scanner;
/*СQ�õ�һ�����������: 1, 12, 123,...12345678910,1234567891011...��
 * ����СQ�����ܷ�3����������ʺܸ���Ȥ��
 * СQ����ϣ�����ܰ�������һ�´����еĵ�l������r��(�����˵�)�ж��ٸ������Ա�3������
 * 
 * ��������:
 * ���������������l��r(1 <= l <= r <= 1e9), ��ʾҪ�����������ˡ�
 * �������:
 * ���һ������, ��ʾ�������ܱ�3���������ָ�����
 **/
public class test006 {
	public static void num() {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int n = scanner.nextInt();
		int res = 0;
		long sum = 0;
		for(long i = r; i <= n; i ++) {
			sum = (i + 1) * i / 2;
			if(sum % 3 == 0) {
				res ++;
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		num();
	}
}
