package creational.factory.service;

public class PaymentCash implements Payment{
	@Override
	public void createPayment() {
		System.out.println(" ::: PaymentCash :::");
	}
}
