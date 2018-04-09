package algorithm;

import java.math.BigDecimal;
import java.util.Scanner;
public class test021 {
    public static void main(String[] args) { 
        
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        long[] arrays = new long[n];
        String[] strings = new String[n];
        
        for(int i = 0; i < n; i++) {
        	arrays[i] = Long.valueOf(in.nextLine());
        }
        
        BigDecimal aBigDecimal = new BigDecimal("2.0");
        BigDecimal bigDecimal = new BigDecimal("1.0");
        BigDecimal cigDecimal = new BigDecimal("0.0");

        for(int i = 0; i < n; i++) {
        	BigDecimal number = BigDecimal.valueOf(arrays[i]);
        	boolean flag = false;
        	
        	for(BigDecimal y = aBigDecimal; y.compareTo(number) < 0; y=y.multiply(aBigDecimal)) {
        		BigDecimal[] results = number.divideAndRemainder(y);
        		BigDecimal[] results2 = results[0].divideAndRemainder(aBigDecimal);
        		if (results[1].compareTo(cigDecimal) == 0 && results2[1].compareTo(bigDecimal) ==0) {
        			strings[i] = String.valueOf(results[0]) + " " + String.valueOf(Long.valueOf(y.toString().split("\\.")[0]));
        			flag = true;
        			break;
        		}
        	}
        	if (flag == false) {
        		strings[i] = "No";
        	}
        }
        
        for(int i = 0; i < n; i++) {
        	System.out.println(strings[i]);
        }
    }
}