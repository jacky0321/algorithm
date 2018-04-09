package algorithm;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine());
        long[] arrays = new long[n];
        String[] strings = new String[n];
        
        for(int i = 0; i < n; i++) {
        	arrays[i] = Long.valueOf(in.nextLine());
        }
        
        for(int i = 0; i < n; i++) {
        	long number = arrays[i];
        	boolean flag = false;
        	for(long y = 2; y < number; y*=2) {
        		if (number == number / y * y && number/y  % 2 == 1) {
        			strings[i] = String.valueOf(number/y) + " " + String.valueOf(y);
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