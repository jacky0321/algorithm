package algorithm;

public class test010 {

	public static void main(String[] args) {
		System.out.println(foo());

	}
	static int foo(){
		int i=10;
		try{
			i=--i/0;
			return i;
		}catch(Exception e){
			i=i--/0;
			return i;
		}finally{
			i--;
			return i;
		}
	
	
	}
}
