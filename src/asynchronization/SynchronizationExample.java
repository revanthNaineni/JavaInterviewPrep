package asynchronization;

import java.util.concurrent.Callable;

public class SynchronizationExample {
	
	int age;
	
	public void getAge() {
		age=age+10;
    	System.out.println("Age is "+ age);
    }
	
	Runnable task1 = () -> {
        // Simulate a long-running task
    	System.out.println("Test1");
    	
        
        getAge();
        System.out.println("Test2");
       // return "Result from Task 1";
    };

    Runnable task2 = () -> {
        // Simulate a long-running task
    	System.out.println("Test3");
    	getAge();
        
        System.out.println("Test4");
        //return "Result from Task 2";
    };

    Runnable task3 = () -> {
        // Simulate a long-running task
    	System.out.println("Test5");
    	getAge();
        
        System.out.println("Test6");
        //return "Result from Task 3";
    };

	public static void main(String[] args) throws InterruptedException {
		
		SynchronizationExample example=new SynchronizationExample();
        
        
        Thread thread1=new Thread(example.task1);
        Thread thread2=new Thread(example.task2);
        Thread thread3=new Thread(example.task3);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        thread1.join();
        thread2.join();
        thread3.join();
        
	}

}
