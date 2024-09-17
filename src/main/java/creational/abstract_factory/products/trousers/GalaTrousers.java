package creational.abstract_factory.products.trousers;

import creational.abstract_factory.products.Trousers;

public class GalaTrousers  implements Trousers {
	@Override
	public boolean hasPockets() {
		System.out.println(" :: SportTrousers - hasPockets - SI ::");
		return true;
	}

	@Override
	public String typeClosure() {
		System.out.println(" :: SportTrousers - typeClosure - Zipper ::");
		return "Zipper";
	}
}
