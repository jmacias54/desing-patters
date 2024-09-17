package creational.factory.service;

public class PaymentTransfer implements Payment{
	@Override
	public void createPayment() {
		System.out.println(" ::: PaymentTransfer :::");
	}
}
