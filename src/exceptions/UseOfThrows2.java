package exceptions;


import java.io.IOException;

class Aa{
	
	public static void getAge() throws IOException{
		throw new IOException();
	}
}

class Bb extends Aa{
	public Bb() throws IOException {
		getAge();
	}
}

public class UseOfThrows2 {

	public static void main(String[] args) {
		try {
			Bb b=new Bb();
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


