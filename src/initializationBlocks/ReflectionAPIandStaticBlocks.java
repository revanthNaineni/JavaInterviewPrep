package initializationBlocks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class SBlock {
	public int age=20;
	private String name="Revanth";
	public SBlock() {
	}
	
	public SBlock(String msg) {
		this();
	}
	
	private SBlock(String msg, int age) {
		this();
	}

	static {
		System.out.println("Static block called");
	}

	public static void test() {
		System.out.println("Test method called");
	}
	private static void test1() {
		System.out.println("Private Test method called");
	}
	
	private static void test2(int age, int height) {
		System.out.println("Private Test2 method called with parameters "+ age +" and "+ height );
	}
}
public class ReflectionAPIandStaticBlocks {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException {
		//SBlock.test();
		Class sblock = Class.forName("initializationBlocks.SBlock");
		SBlock sb = (SBlock)sblock.newInstance();
		System.out.println(sblock.getName());
		System.out.println(sblock.getSuperclass());
		Constructor[] constructors = sblock.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName());
			System.out.println(constructor);
		}
		
		Field[] fields = sblock.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		Field[] declaredFields = sblock.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}
		
		Method[] methods = sblock.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		Method[] declaredMethods = sblock.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		
		Method declaredMethod = sblock.getDeclaredMethod("test1", null);
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(sb);
		
		Method declaredMethod2 = sblock.getDeclaredMethod("test2", int.class, int.class);
		declaredMethod2.setAccessible(true);
		declaredMethod2.invoke(sb,30,10);
		

		
	}

}
