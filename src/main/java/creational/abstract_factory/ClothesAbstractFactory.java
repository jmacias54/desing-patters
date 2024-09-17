package creational.abstract_factory;

import creational.abstract_factory.products.Shirt;
import creational.abstract_factory.products.Shoe;
import creational.abstract_factory.products.Trousers;

public interface ClothesAbstractFactory {

	Shoe createShoes();

	Shirt createShirt();

	Trousers createTrousers();

}
