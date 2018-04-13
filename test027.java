package algorithm;

import java.lang.reflect.Field;
import java.util.Arrays;

class shallowOrDeepObj implements Cloneable{
	private int intVal;
	private String stringVal;
	private int[] arrays;
	
	public shallowOrDeepObj(int intVal, String stringVal, int[] arrays) {
		super();
		this.intVal = intVal;
		this.stringVal = stringVal;
		this.arrays = arrays;
	}
	
	public shallowOrDeepObj(shallowOrDeepObj obj) {
		this.intVal = obj.intVal;
		this.stringVal = obj.stringVal;
		this.arrays = obj.arrays;
	}
	
	public int getIntVal() {
		return intVal;
	}
	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}
	public String getStringVal() {
		return stringVal;
	}
	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
		
	}

	public int[] getArrays() {
		return arrays;
	}

	public void setArrays(int[] arrays) {
		this.arrays = arrays;
	}

	public void modifyArrays(int index, int i) {
		this.arrays[index] = i;
	}
	
	@Override
	public String toString() {
		return "shallowOrDeepObj [intVal=" + intVal + ", stringVal=" + stringVal + ", arrays=" + Arrays.toString(arrays)
				+ "]";
	}

	public shallowOrDeepObj clone() {
		shallowOrDeepObj object = null;
		try {
			object = (shallowOrDeepObj)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return object;
	}
}

class shallowOrDeepObj2 implements Cloneable{
	private int intVal;
	private String stringVal;
	private int[] arrays;
	
	public shallowOrDeepObj2(int intVal, String stringVal, int[] arrays) {
		super();
		this.intVal = intVal;
		this.stringVal = stringVal;
		this.arrays = arrays;
	}
	
	public shallowOrDeepObj2(shallowOrDeepObj2 obj) {
		this.intVal = obj.intVal;
		this.stringVal = obj.stringVal;
		this.arrays = obj.arrays;
	}
	
	public int getIntVal() {
		return intVal;
	}
	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}
	public String getStringVal() {
		return stringVal;
	}
	public void setStringVal(String stringVal) {
		this.stringVal = stringVal;
		
	}

	public int[] getArrays() {
		return arrays;
	}

	public void setArrays(int[] arrays) {
		this.arrays = arrays;
	}

	public void modifyArrays(int index, int i) {
		this.arrays[index] = i;
	}
	
	@Override
	public String toString() {
		return "shallowOrDeepObj [intVal=" + intVal + ", stringVal=" + stringVal + ", arrays=" + Arrays.toString(arrays)
				+ "]";
	}

	public shallowOrDeepObj2 clone() {
		shallowOrDeepObj2 object = null;
		try {
			object = (shallowOrDeepObj2)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		object.arrays = arrays.clone();
		return object;
	}
}


public class test027 {

	public static void testString() throws Exception{
		final int[] values = {1,2,3};
		int[] vals = {4,5,6};
		System.out.println(Arrays.toString(values));
		values[0] = 1000;
		System.out.println(Arrays.toString(values));
//		values = vals;
		
		String string = "Hello world";
		System.out.println("s = " + string);
		Field valueFieldOfString = String.class.getDeclaredField("value");
		valueFieldOfString.setAccessible(true);
		char[] value = (char[]) valueFieldOfString.get(string);
		value[5] = '_';
		System.out.println("s = " + string);
	}
	
	public static void ShallowOrDeepClone() {
//		int[] arrays = {1,2,3};
//		shallowOrDeepObj obj1 = new shallowOrDeepObj(1,"abc", arrays);
//		shallowOrDeepObj obj2 = new shallowOrDeepObj(obj1);
//		System.out.println(obj1);
//		System.out.println(obj2);
//		
//		obj1.setIntVal(2);
//		obj1.setStringVal("def");
//		arrays[0] = 10;
//		obj1.setArrays(arrays);
//		obj1.modifyArrays(1, 20);
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
		
//		int[] arrays = {1,2,3};
//		shallowOrDeepObj obj1 = new shallowOrDeepObj(1, "abc", arrays);
//		shallowOrDeepObj obj2 =  obj1.clone();
//		System.out.println(obj1);
//		System.out.println(obj2);
//		
//		obj1.setIntVal(2);
//		obj1.setStringVal("def");
//		arrays[0] = 10;
//		obj1.setArrays(arrays);
//		obj1.modifyArrays(1, 20);
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
		
		int[] arrays = {1,2,3};
		shallowOrDeepObj2 obj1 = new shallowOrDeepObj2(1, "abc", arrays);
		shallowOrDeepObj2 obj2 =  obj1.clone();
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.setIntVal(2);
		obj1.setStringVal("def");
		arrays[0] = 10;
		obj1.setArrays(arrays);
		obj1.modifyArrays(1, 20);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	public static void main(String[] args) {

		ShallowOrDeepClone();
	}
}
