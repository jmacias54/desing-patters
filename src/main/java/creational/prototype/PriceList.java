package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PriceList implements IPrototype {

	private String name;
	private List<Product> productList = new ArrayList<>();

	public PriceList(String name) {
		this.name = name;
	}

	@Override
	public IPrototype clone() {
		PriceList clone = new PriceList(name);
		clone.setProductList(productList);
		return clone;
	}

	@Override
	public IPrototype deepClone() {
		PriceList deepClone = new PriceList(name);

		List<Product> cloneProducts = productList.stream()
			.map(p -> (Product)p.clone())  // Clonar cada producto
			.collect(Collectors.toList()); // Recoger los clones en una nueva lista

		deepClone.setProductList(cloneProducts);

		return deepClone;
	}

	public String getName() {
		return name;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return Integer.toHexString(System.identityHashCode(this)) +" - PriceList{" +
			"name='" + name + '\'' +
			", productList=" + productList +
			'}';
	}
}
