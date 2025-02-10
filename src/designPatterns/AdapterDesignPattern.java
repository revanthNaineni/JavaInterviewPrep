package designPatterns;

interface Paymentprocessor1{
	void processPayment(double amount);
}

class CreditCardPaymentProcessor1 implements Paymentprocessor1{

	@Override
	public void processPayment(double amount) {
		System.out.println("Payment of $" + amount + " processed using CreditCard.");
	}
	
}

class PayPalPaymentProcessor1{
	public void processPaypalpayment(double amount) {
		System.out.println("Payment of $" + amount + " processed using Paypal.");
	}
}

class PaypalPaymentAdapterProcessor1 implements Paymentprocessor1{
	
	private PayPalPaymentProcessor1 payPalPaymentProcessor;
	
	public PaypalPaymentAdapterProcessor1(PayPalPaymentProcessor1 payPalPaymentProcessor) {
		this.payPalPaymentProcessor = payPalPaymentProcessor;
	}

	@Override
	public void processPayment(double amount) {
		payPalPaymentProcessor.processPaypalpayment(amount);
	}
	
}
public class AdapterDesignPattern {
	
	public static void main(String[] args) {
		PaypalPaymentAdapterProcessor1 paypalPaymentAdapterProcessor = new PaypalPaymentAdapterProcessor1(new PayPalPaymentProcessor1());
		paypalPaymentAdapterProcessor.processPayment(120);
	}

}
