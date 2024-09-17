package creational.factory.service;

import creational.factory.model.PayType;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

	private static final Map<PayType, Payment> paymentsMap;

	static {
		paymentsMap = new HashMap<>();
		paymentsMap.put(PayType.CASH, new PaymentCash());
		paymentsMap.put(PayType.PAYPAL, new PaymentPaypal());
		paymentsMap.put(PayType.BITCOIN, new PaymentBitcoin());
		paymentsMap.put(PayType.TRANSFER, new PaymentTransfer());
		paymentsMap.put(PayType.CREDIT_CARD, new PaymentCreditCard());
		paymentsMap.put(PayType.DEBIT_CARD, new PaymentDebitCard());
	}

	public Payment getPaymentType(PayType payType) {
		return paymentsMap.get(payType);
	}

}
