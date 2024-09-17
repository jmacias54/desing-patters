package creational.abstract_factory;

import creational.abstract_factory.factories.GalaClothesFactory;
import creational.abstract_factory.factories.SportClothesFactory;
import creational.abstract_factory.products.Shirt;
import creational.abstract_factory.products.Shoe;
import creational.abstract_factory.products.Trousers;
import creational.abstract_factory.products.shirts.GalaShirt;
import creational.abstract_factory.products.shirts.SportShirts;
import creational.abstract_factory.products.shoes.GalaShoe;
import creational.abstract_factory.products.trousers.GalaTrousers;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		System.out.println(" ::: AbstractFactoryMain ::: ");

		SportClothesFactory sportClothesFactory = new SportClothesFactory();
		SportShirts sportShirts= (SportShirts)sportClothesFactory.createShirt();
		Shoe shoe = sportClothesFactory.createShoes();
		Trousers trousers = sportClothesFactory.createTrousers();

		System.out.println("::: Ropa Deportiva ::::");
		System.out.println("Shirt hasButtons "+sportShirts.hasButtons());
		System.out.println("Shirt hasLongSleeaves "+sportShirts.hasLongSleeaves());


		GalaClothesFactory galaClothesFactory = new GalaClothesFactory();
		GalaShirt galaShirt= (GalaShirt)galaClothesFactory.createShirt();
		GalaShoe galaShoe = (GalaShoe)galaClothesFactory.createShoes();
		GalaTrousers galaTrousers = (GalaTrousers)galaClothesFactory.createTrousers();

		System.out.println("::: Ropa GALA ::::");
		System.out.println("GALA Shirt hasButtons "+galaShirt.hasButtons());
		System.out.println("GALA Shirt hasLongSleeaves "+galaShirt.hasLongSleeaves());




	}
}
