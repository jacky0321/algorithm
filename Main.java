package algorithm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[][]a=new int[n][2];
		
		for(int j=0;j<n;j++){
			a[j][0]=sc.nextInt();
			a[j][1]=sc.nextInt();
		}
		
		int max = n*(n-1)*(n-2)/6;
		
		for(int i=0;i<n;i++){
			for(int j=i+2;j<n;j++){
				if((a[i][1]-a[i+1][1])*(a[i][0]-a[j][0])==(a[i][1]-a[j][1])*(a[i][0]-a[i+1][0])){
					max--;
				}
				
			}
			
		}
		System.out.println(max);

	}

}