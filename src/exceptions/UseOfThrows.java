package exceptions;

import java.io.IOException;

class A{
	
	public void getAge() throws IOException{
		throw new IOException();
	}
}

class B extends A{
	public B() throws IOException {
		getAge();
	}
}

public class UseOfThrows {

	public static void main(String[] args) {
		try {
			B b=new B();
			b.getAge();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
