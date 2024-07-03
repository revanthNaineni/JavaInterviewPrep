package oOPS;

class E1 {
	private int accountNumber;
	private String holdername;
	private int balance;
	private String country;

	public int getAccountNumber() {
		return accountNumber;
	}

	/*
	 * public void setAccountNumber(int accountNumber) { this.accountNumber =
	 * accountNumber; }
	 */

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

public class QEncapsulation {

	public static void main(String[] args) {
		E1 e1=new E1();
		System.out.println(e1.getAccountNumber());
	}

}
