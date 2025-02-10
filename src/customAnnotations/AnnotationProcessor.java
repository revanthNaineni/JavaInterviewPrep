package customAnnotations;

import java.lang.reflect.Method;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Specify where the annotation can be applied
@Target({ ElementType.METHOD, ElementType.TYPE })

// Specify the retention policy (runtime or compile-time)
@Retention(RetentionPolicy.RUNTIME)

// Define the annotation
@interface MyAnnotation {
	String value() default "Default Value";

	int count() default 1;
}

@MyAnnotation(value = "Hello Annotation", count = 3)
class MyClass {

	@MyAnnotation(value = "Method Annotation", count = 5)
	public void myMethod() {
		System.out.println("MyMethod executed");
	}
}

public class AnnotationProcessor {
	public static void main(String[] args) {
		// Access the class annotations
		if (MyClass.class.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation annotation = MyClass.class.getAnnotation(MyAnnotation.class);
			System.out.println("Class Annotation Value: " + annotation.value());
			System.out.println("Class Annotation Count: " + annotation.count());
		}

		// Access the method annotations
		for (Method method : MyClass.class.getDeclaredMethods()) {
			if (method.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
				System.out.println("Method: " + method.getName());
				System.out.println("Method Annotation Value: " + annotation.value());
				System.out.println("Method Annotation Count: " + annotation.count());
			}
		}
	}
}