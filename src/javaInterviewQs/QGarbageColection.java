package javaInterviewQs;

public class QGarbageColection {

	public static void main(String[] args) {
		
		QGarbageColection colection=new QGarbageColection();
		colection=null;
		System.out.println("main method called 1");
		//two ways
		//System.gc();//first way
		Runtime.getRuntime().gc();//second way
		System.out.println("main method called 2");

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Unreferenced objects cleaned from the Heap");
		//throw new RuntimeException();
	}

}
