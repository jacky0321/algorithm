package algorithm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

//class basicAC {
//	
//	//******�Ż��������*******//
//    /**
//     * �滻�׳˵���һ�ַ�ʽ(��n��ʼ�ݼ���ˣ���m����)
//     * @param n
//     * @param m
//     * @return
//     */
//    private static long factorialSec(int m, int n) {
//        long sum = 1;
//
//        while(m > 0 && n > 0) {
//            sum = sum * n--;
//            m--;
//        }
//        return sum;
//    }
//    /**
//     * ����
//     * @param m
//     * @param n
//     * @return
//     */
//    public static long arrangementSec(int m, int n) {
//        return m <= n ? factorialSec(m, n) : 0;
//    }
//    /**
//     * ���
//     * @param m
//     * @param n
//     * @return
//     */
//    public static long combinationSec(int m, int n) {
//        if( m > n )
//            return 0;
//        if( m > n/2 )
//        {
//            m = n - m;
//        }
//        return factorialSec(m, n)/factorialSec(m, m);
//    }
//    //******�Ż�����******//
//    
//    
//	private static long factorial(int n) {
//		 return n > 1 ? n * factorial(n - 1) : 1;
//	}
//
//	public static long combination(int n, int m) {
//		 return (n >= m) ? factorial(n) / (factorial(n - m) * factorial(m)) : 0;
//	}
//
//	public static long arrangement(int n, int m) {  
//	    return (n >= m) ? factorial(n) / factorial(n - m) : 0;  
//	} 
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int k = in.nextInt();
//
//		int a = in.nextInt();
//		int x = in.nextInt();
//
//		int b = in.nextInt();
//		int y = in.nextInt();
//
//		int length = 0;
//		if (a == 0 && b == 0) {
//			length = 0;
//		} else if (a != 0 && b != 0) {
//			length = k / Math.min(a, b);
//		} else {
//			length = k / Math.max(a, b);
//		}
//
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int m = 0; m <= length; m++) {
//			for (int n = 0; n <= length; n++) {
//				if (m * a + n * b == k) {
//					map.put(m, n);
//				}
//			}
//		}
//
//
//		int result = 0;
//		
//		for (Entry<Integer, Integer> entry : map.entrySet()) {
//			int xx = entry.getKey();
//			int yy = entry.getValue();
//			if (xx <= x && yy <= y) {
//				 result += combination(x, xx) * combination(y, yy);
//			}
//
//		}
//
//		System.out.println(result%1000000007);
//
//	}
//
//}


//public class test019 {
//	private static BigInteger factorial(BigInteger n) {
//		BigInteger a = new BigInteger("1");
//		BigInteger c = new BigInteger("1");
//		if (n.compareTo(c) > 0) {
//			a = n.multiply(factorial(n.subtract(c)));
//		} else {
//			a = c;
//		}
//		return a;
//	}
//
//	public static BigInteger arrangement(BigInteger n, BigInteger m) {
//		BigInteger a = new BigInteger("0");
//		if (n.compareTo(m) >= 0) {
//			a = factorial(n).divide(factorial(n.subtract(m)));
//		} 
//		return a;
//	      
//	} 
//	
//	public static BigInteger combination(BigInteger n, BigInteger m) {
//		BigInteger a = new BigInteger("0");
//		if (n.compareTo(m) >= 0) {
//			a = factorial(n).divide(factorial(n.subtract(m)).multiply(factorial(m)));
//		}
//		return a;
//	}
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int k = in.nextInt();
//
//		int a = in.nextInt();
//		int x = in.nextInt();
//
//		int b = in.nextInt();
//		int y = in.nextInt();
//
//		int length = 0;
//		if (a == 0 && b == 0) {
//			length = 0;
//		} else if (a != 0 && b != 0) {
//			length = k / Math.min(a, b);
//		} else {
//			length = k / Math.max(a, b);
//		}
//
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int m = 0; m <= length; m++) {
//			for (int n = 0; n <= length; n++) {
//				if (m * a + n * b == k) {
//					map.put(m, n);
//				}
//			}
//		}
//
//		BigInteger result = new BigInteger("0");
//
//		for (Entry<Integer, Integer> entry : map.entrySet()) {
//			int xx = entry.getKey();
//			int yy = entry.getValue();
//			if (xx <= x && yy <= y) {
//				result = result.add(combination(BigInteger.valueOf(x), BigInteger.valueOf(xx))
//						.multiply(combination(BigInteger.valueOf(y), BigInteger.valueOf(yy))));
//			}
//
//		}
//		BigInteger m = new BigInteger("1000000007");
//		System.out.println(result.mod(m));
//
//	}
//
//}


public class test019 {
	
	private static long factorial(int n) {
		 return n > 1 ? n * factorial(n - 1) : 1;
	}

	public static long combination(int n, int m) {
		 return (n >= m) ? factorial(n) / (factorial(n - m) * factorial(m)) : 0;
	}

	public static long arrangement(int n, int m) {  
	    return (n >= m) ? factorial(n) / factorial(n - m) : 0;  
	} 
	
    /**
     * ����ѡ�񣨴��б���ѡ��n�����У� 
     * @param dataList ��ѡ�б� 
     * @param n ѡ����� 
     */
	
    public static void arrangementSelect(String[] dataList, int n) {
        System.out.println(String.format("A(%d, %d) = %d", dataList.length, n, 
                arrangement(n, dataList.length)));
        arrangementSelect(dataList, new String[n], 0);
    }

    /** 
     * ����ѡ�� 
     * @param dataList ��ѡ�б� 
     * @param resultList ǰ�棨resultIndex-1���������н�� 
     * @param resultIndex ѡ����������0��ʼ 
     */  
    private static void arrangementSelect(String[] dataList, String[] resultList, int resultIndex) {
        int resultLen = resultList.length;
        if (resultIndex >= resultLen) { // ȫ��ѡ����ʱ��������н�� 
            System.out.println(Arrays.asList(resultList));
            return;
        }

        // �ݹ�ѡ����һ��
        for (int i = 0; i < dataList.length; i++) {
            // �жϴ�ѡ���Ƿ���������н����
            boolean exists = false;
            for (int j = 0; j < resultIndex; j++) {
                if (dataList[i].equals(resultList[j])) {
                    exists = true;
                    break;
                }
            }
            if (!exists) { // ���н�������ڸ���ſ�ѡ��
                resultList[resultIndex] = dataList[i];
                arrangementSelect(dataList, resultList, resultIndex + 1);
            }
        }
    }
}

