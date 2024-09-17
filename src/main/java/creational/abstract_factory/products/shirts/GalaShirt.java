package creational.abstract_factory.products.shirts;

import creational.abstract_factory.products.Shirt;

public class GalaShirt implements Shirt {
	@Override
	public boolean hasLongSleeaves() {
		System.out.println(" :: Camisa Gala - SI tiene Mangas Largas ::");
		return true;
	}

	@Override
	public boolean hasButtons() {
		System.out.println(" :: Camisa Gala - SI tiene Botones ::");
		return true;
	}
}
