package oOPS;

interface RBI{
	int value=20;
	void interestRate();
	 default void loanAmount() {
		System.out.println("2Lakh");
		bikeLoan();
	}
	 static void houseLoan() {
		 System.out.println("2Lakh");
		 
	 }
	 
	 private void bikeLoan() {
		 System.out.println("50k");
		 interestRate();
	 }
	
}

interface WorldBank{
	int value=10;
}

class SBIBank implements RBI,WorldBank{

	SBIBank(){
		super();
		//System.out.println(value);Will get compilation error if access value variable directly
		//because of Ambiguity problem.We can fix this issue by accessing variable using Interface name
		System.out.println(WorldBank.value);
		System.out.println(RBI.value);
	}
	@Override
	public void interestRate() {
		System.out.println("SBI Interest rate 12%");
	}
	
	
	@Override
	public void loanAmount() { // TODO Auto-generated method stub
		System.out.println("3Lakh");
	}
	 
	
	static void houseLoan() {
		 System.out.println("3Lakh");
	 }
	
}


public class QInterface {
	
public static void main(String[] args) {
	RBI rbi=new SBIBank();
	rbi.interestRate();
	rbi.loanAmount();
	//System.out.println(value);
	RBI.houseLoan();
	SBIBank.houseLoan();
}	

}
