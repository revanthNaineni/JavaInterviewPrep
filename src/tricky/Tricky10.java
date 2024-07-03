package tricky;

public class Tricky10 {

	public static void main(String[] args) {
		if (true) 
            break;
	}

}

//Break statement can only be used with loop or switch. So, using break with if statement causes “break outside switch or loop” error.
