package algorithm;

import java.util.Scanner;

public class Pack01 {  
    public int[] v;//��ֵ����  
    public int[] w;//��������  
    public int c;//��������  
    public int[][] m;//m(i,j)�Ǳ�������Ϊj����ѡ��ƷΪ��i��i+1��i+2��i+3,...,n ʱ0-1�������������ֵ  
    public int[] x;//�����i����Ʒ�Ƿ���뱳����1�����룻0��δ����  
    public Pack01(int[] vv,int[] ww,int cc){  
        this.v=vv;  
        this.w=ww;  
        this.c=cc;  
        this.x=new int[vv.length];  
        int max = maxM(w,c);//��ȡj�����ֵ���Ӷ�ͨ��new�ؼ��ִ���m���飬���ڴ���ά���������Ӧ�Ĵ洢�ռ�  
        m = new int[v.length][max+1];  
    }  
    /** 
     * ��ȡ�����ͱ������������ֵ���Ӷ�Ϊm������Ӧ�Ĵ洢�ռ� 
     * @param w 
     * @param c 
     * @return 
     */  
    public int maxM(int[] w,int c){  
        int max = c;  
        for(int i=1;i<w.length;i++){  
            if(w[i]>c)  
                max=w[i];  
        }  
        return max;  
    }  
    public void knapsack(int[] v,int[] w,int c,int[][] m){  
        int n =v.length-1;  
        int jMax = Math.min(w[n]-1, c);  
        for(int j = 0;j <= jMax;j++)  
            m[n][j]=0;  
        for(int j=w[n];j<=c;j++)  
            m[n][j]=v[n];  
        for(int i=n-1;i>1;i--){  
            jMax=Math.min(w[i]-1,c);  
            for(int j=0;j<=jMax;j++)  
                m[i][j]=m[i+1][j];  
            for(int j=w[i];j<=c;j++)  
                m[i][j]=Math.max(m[i+1][j], m[i+1][j-w[i]]+v[i]);  
        }  
        //m[1][c]=m[2][c];  
        if(c>=w[1])//����i=1ʱ���������  
            m[1][c]=Math.max(m[2][c], m[2][c-w[1]]+v[1]);  
        else  
            m[1][c]=m[2][c];  
          
    }  
    public void traceback(int[][] m,int[] w,int c,int[] x){  
        int n=w.length-1;  
        for(int i=1;i<n;i++){  
            if(m[i][c]==m[i+1][c])//��i����δ����  
                x[i]=0;  
            else{  
                x[i]=1;  
                c-=w[i];//c��ȫ�ֱ���  
            }  
        }  
        x[n]=(m[n][c]>0)?1:0;  
    }  
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);


        int c = Integer.parseInt(sc.nextLine());  
        
		String string1 = sc.nextLine();
		String[] ww = string1.split(" ");
		String string2 = sc.nextLine();
		String[] vv = string2.split(" ");
		
        int w[] = new int[ww.length];  
        int v[] = new int[vv.length];  
        
		for(int i=0; i <w.length; i++){
			w[i]=Integer.parseInt(ww[i]);
			v[i]=Integer.parseInt(vv[i]);
		}
		
        Pack01 pa = new Pack01(v,w,c);  
        pa.knapsack(pa.v, pa.w, pa.c, pa.m);  
        System.out.println("װ�뱳������Ʒ�ܼ�ֵ���Ϊ��");  
        System.out.println(pa.m[1][c]);  
        pa.traceback(pa.m, pa.w, pa.c, pa.x);  
        System.out.println("װ�����Ʒ�����Ϊ��");  
        for(int i=0;i<=v.length-1;i++){  
            if(pa.x[i]==1)  
                System.out.print(i+1+" ");  
        }  
    }  
}  
