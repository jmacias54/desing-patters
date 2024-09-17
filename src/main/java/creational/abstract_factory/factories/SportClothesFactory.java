package creational.abstract_factory.factories;

import creational.abstract_factory.ClothesAbstractFactory;
import creational.abstract_factory.products.Shirt;
import creational.abstract_factory.products.Shoe;
import creational.abstract_factory.products.Trousers;
import creational.abstract_factory.products.shirts.SportShirts;
import creational.abstract_factory.products.shoes.SportShoe;
import creational.abstract_factory.products.trousers.SportTrousers;

public class SportClothesFactory implements ClothesAbstractFactory {

	@Override
	public Shoe createShoes() {
		return new SportShoe();
	}

	@Override
	public Shirt createShirt() {
		return new SportShirts();
	}

	@Override
	public Trousers createTrousers() {
		return new SportTrousers();
	}
}
