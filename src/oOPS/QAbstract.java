package oOPS;

  abstract class Bank{
	String holderName;
	String branchName;
	
	public Bank() {
		
	}
	 public Bank(String holderName, String branchName) {
		this.holderName = holderName;
		this.branchName = branchName;
	}

	abstract void interestRate();
	
	public void test() {
		System.out.println("test");
	}
	
	public static void getLoan() {
		System.out.println("Approved");
	}
}

class SBI extends Bank{
	
	SBI(String name,String branch) {
		super(name,branch);
		System.out.println("SBI constructor");
 
	}

	@Override
	protected void interestRate() {
		
		System.out.println("12 %");
		
	}
	
	public void test2() {
		System.out.println("test SBI");
	}
	
}

public class QAbstract {

	public static void main(String[] args) {
		
		SBI sbi=new SBI("Dembele","Jmkt");
		sbi.interestRate();
		sbi.test();
		sbi.test2();
		SBI.getLoan();
		System.out.println(sbi.branchName+" : "+sbi.holderName);

	}

}
