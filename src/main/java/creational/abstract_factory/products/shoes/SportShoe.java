package creational.abstract_factory.products.shoes;

import creational.abstract_factory.products.Shoe;

public class SportShoe implements Shoe {
	@Override
	public boolean isElegantShoes() {
		System.out.println(" :: SportShoe - isElegantShoes - NO ::");
		return false;
	}

	@Override
	public boolean isRunningShoes() {
		System.out.println(" :: SportShoe - isRunningShoes - SI ::");
		return true;
	}
}
