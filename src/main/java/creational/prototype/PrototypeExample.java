package creational.prototype;

import java.util.List;

public class PrototypeExample {


	public static void main(String[] args) {
		System.out.println(" prototype :");
		// lista de precios inicial

		PriceList priceList = new PriceList("Lista normal");
		List<Product> productList = List.of(
			new Product("PC", 450000),
			new Product("Mouse", 350),
			new Product("Cooler", 800),
			new Product("Headphones", 600)
		);
		priceList.setProductList(productList);

		System.out.println("priceList > " + priceList);

		// segunda lista de precios con descuento
		PriceList priceList2 = (PriceList)priceList.deepClone();
		priceList2.setName("Lista con descuentos");
		priceList2.getProductList().forEach(product -> {
			double discountedPrice = product.getPrice() * 0.7;  // Aplicar el descuento del 30%
			product.setPrice(discountedPrice);
		});
		System.out.println(" priceList2 > "+priceList2);
	}
}
