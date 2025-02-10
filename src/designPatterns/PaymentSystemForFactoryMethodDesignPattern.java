package designPatterns;

interface PaymentProcessor {
	void processPayment(double amount);
}

//Credit Card Payment Processor
class CreditCardPaymentProcessor implements PaymentProcessor {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Credit Card payment of $" + amount);
	}
}

//PayPal Payment Processor
class PayPalPaymentProcessor implements PaymentProcessor {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}
}

//Bank Transfer Payment Processor
class BankTransferPaymentProcessor implements PaymentProcessor {
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Bank Transfer payment of $" + amount);
	}
}

abstract class PaymentFactory {
	// Factory Method
	public abstract PaymentProcessor createPaymentProcessor();
}

//Factory for Credit Card Payment
class CreditCardPaymentFactory extends PaymentFactory {
	@Override
	public PaymentProcessor createPaymentProcessor() {
		return new CreditCardPaymentProcessor();
	}
}

//Factory for PayPal Payment
class PayPalPaymentFactory extends PaymentFactory {
	@Override
	public PaymentProcessor createPaymentProcessor() {
		return new PayPalPaymentProcessor();
	}
}

//Factory for Bank Transfer Payment
class BankTransferPaymentFactory extends PaymentFactory {
	@Override
	public PaymentProcessor createPaymentProcessor() {
		return new BankTransferPaymentProcessor();
	}
}

public class PaymentSystemForFactoryMethodDesignPattern {
	
	public static void main(String[] args) {
		PaymentFactory paymentFactory;
		PaymentProcessor processor;

		// User selects Credit Card as payment method
		paymentFactory = new CreditCardPaymentFactory();
		processor = paymentFactory.createPaymentProcessor();
		processor.processPayment(150.75); // Process Credit Card payment

		// User selects PayPal as payment method
		paymentFactory = new PayPalPaymentFactory();
		processor = paymentFactory.createPaymentProcessor();
		processor.processPayment(89.50); // Process PayPal payment

		// User selects Bank Transfer as payment method
		paymentFactory = new BankTransferPaymentFactory();
		processor = paymentFactory.createPaymentProcessor();
		processor.processPayment(300.00); // Process Bank Transfer payment
	}
}
