package algorithm;

import java.util.Scanner;  

public class test015 {  
    public static void main(String[] args) {  
        int hour;
        int minute;  
        double intern;
        
        Scanner scanner = new Scanner(System.in);  
        String arrayStr[] = scanner.nextLine().split(":");  

        hour = Integer.valueOf(arrayStr[0]);  
        minute = Integer.valueOf(arrayStr[1]);  
        intern = (30 * hour - 5.5 * minute) % 360;
        
        intern = intern > 180 ? 360 - intern: intern;
        
        if (intern - Math.floor(intern) == 0) {
        	System.out.println((int)intern);  
        } else {
        	System.out.println(String.format("%.1f", intern));
		}
        
        
    }  
  
} 