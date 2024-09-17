package creational.factory.service;

public class PaymentBitcoin implements Payment{
	@Override
	public void createPayment() {
		System.out.println(" ::: PaymentBitcoin :::");
	}
}
