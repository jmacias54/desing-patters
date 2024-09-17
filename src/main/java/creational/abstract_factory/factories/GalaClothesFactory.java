package creational.abstract_factory.factories;

import creational.abstract_factory.ClothesAbstractFactory;
import creational.abstract_factory.products.Shirt;
import creational.abstract_factory.products.Shoe;
import creational.abstract_factory.products.Trousers;
import creational.abstract_factory.products.shirts.GalaShirt;
import creational.abstract_factory.products.shoes.GalaShoe;
import creational.abstract_factory.products.trousers.GalaTrousers;

public class GalaClothesFactory implements ClothesAbstractFactory {
	@Override
	public Shoe createShoes() {
		return new GalaShoe();
	}

	@Override
	public Shirt createShirt() {
		return new GalaShirt();
	}

	@Override
	public Trousers createTrousers() {
		return new GalaTrousers();
	}
}
