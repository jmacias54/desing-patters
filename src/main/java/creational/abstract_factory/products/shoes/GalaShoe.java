package creational.abstract_factory.products.shoes;

import creational.abstract_factory.products.Shoe;

public class GalaShoe implements Shoe {
	@Override
	public boolean isElegantShoes() {
		System.out.println(" :: SportShoe - isElegantShoes - SI ::");
		return true;
	}

	@Override
	public boolean isRunningShoes() {
		System.out.println(" :: SportShoe - isRunningShoes - NO ::");
		return false;
	}
}
