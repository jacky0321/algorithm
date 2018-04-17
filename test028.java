package algorithm;

interface AAAA {
	public static int a = 10;

	public static final int b = 10;

	public void name();
	
	public void name2();
	
	public static void name3() {
		System.out.println("name3");
	}
	
	public default void name4() {
		System.out.println("name4");
	}
}

public class test028 implements AAAA{

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		AAAA.name3();
		test028 test = new test028();
		test.name4();
		test028.name3();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name2() {
		// TODO Auto-generated method stub
		name4();
	}
	
	public static void name3() {
		System.out.println("Hey name3");
	}
}
