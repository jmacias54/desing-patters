package creational.factory.service;

public class PaymentCreditCard implements Payment{
	@Override
	public void createPayment() {
		System.out.println(" ::: PaymentCreditCard :::");
	}
}
