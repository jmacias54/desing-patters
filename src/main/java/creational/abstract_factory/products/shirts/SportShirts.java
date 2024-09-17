package creational.abstract_factory.products.shirts;

import creational.abstract_factory.products.Shirt;

public class SportShirts implements Shirt {

	@Override
	public boolean hasLongSleeaves() {
		System.out.println(" :: Camisa Deportiva - NO tiene Mangas Largas ::");
		return false;
	}

	@Override
	public boolean hasButtons() {
		System.out.println(" :: Camisa Deportiva - NO tiene Botones ::");
		return false;
	}
}
