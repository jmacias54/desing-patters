package creational.factory.service;

public class PaymentPaypal implements Payment{
	@Override
	public void createPayment() {
		System.out.println(" ::: PaymentPaypal :::");
	}
}
