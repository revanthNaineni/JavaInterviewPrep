package test;
public class TestClass {
public static void main(String[] args) {
     someMethod("");
}
 
public static void someMethod(String s) {
try {
throw new NullPointerException();
} finally {
throw new RuntimeException();
}
}
}