package oOPS;

interface M1 {

	void test();

}

interface M2 {
	void test();

	void travel();
}

class M3 implements M1, M2 {

	@Override
	public void test() {

		System.out.println("M1");
	}

	@Override
	public void travel() {
		System.out.println("M2");
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		M3 m3 = new M3();
		m3.test();
		m3.travel();
	}

}
