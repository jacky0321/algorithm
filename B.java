package algorithm;

class A {
    static {
        System.out.println("A�ľ�̬��");
    }
    private static String staticStr = getStaticStr();

    private String str = getStr();
    {
        System.out.println("A��ʵ����");
    }
    public A() {
        System.out.println("A�Ĺ��췽��");
    }
    private static String getStaticStr() {
        System.out.println("A�ľ�̬���Գ�ʼ��");
        return null;
    }
    private String getStr() {
        System.out.println("A��ʵ�����Գ�ʼ��");
        return null;
    }

}
class B extends A{
    private static String staticStr = getStaticStr();
    static {
        System.out.println("B�ľ�̬��");
    }
    public B() {
        System.out.println("B�Ĺ��췽��");
    }
    {
        System.out.println("B��ʵ����");
    }

    private String str = getStr();
    private static String getStaticStr() {
        System.out.println("B�ľ�̬���Գ�ʼ��");
        return null;
    }
    private String getStr() {
        System.out.println("B��ʵ�����Գ�ʼ��");
        return null;
    }
    
    public static void main(String[] args) {
		System.out.println("init");
		B b = new B();
	}
}