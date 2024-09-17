package creational.abstract_factory.products.trousers;

import creational.abstract_factory.products.Trousers;

public class SportTrousers implements Trousers {
	@Override
	public boolean hasPockets() {
		System.out.println(" :: SportTrousers - hasPockets - NO ::");
		return false;
	}

	@Override
	public String typeClosure() {
		System.out.println(" :: SportTrousers - typeClosure - Sin Cierre ::");
		return "Sin Cierre";
	}
}
