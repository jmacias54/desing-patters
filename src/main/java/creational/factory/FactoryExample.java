package creational.factory;

import creational.factory.model.PayType;
import creational.factory.service.Payment;
import creational.factory.service.PaymentFactory;

public class FactoryExample {

	public static void main(String[] args) {
		System.out.println(" :::: Factory Example ::::: ");

		PaymentFactory factory = new PaymentFactory();
		Payment payment = factory.getPaymentType(PayType.PAYPAL);
		payment.createPayment();
	}
}
