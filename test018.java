package algorithm;

import java.util.Scanner;

public class test018 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		String s= sc.nextLine();
		String[] s1 =s.split(" ");
		String s2= sc.nextLine();
		String[] s3 =s2.split(" ");
		int[][] a=new int[s1.length][];
		for(int i=0;i<s1.length;i++){
			a[i][0]=Integer.parseInt(s1[i]);
			a[i][1]=Integer.parseInt(s3[i]);
		}

	}

}
