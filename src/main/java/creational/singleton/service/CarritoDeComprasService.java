package creational.singleton.service;

import creational.singleton.model.Version;

public class CarritoDeComprasService {

	private Version version;

	public CarritoDeComprasService(Version version) {
		System.out.println(" CarritoDeComprasService Version"+version.toString());

		this.version = version;
	}
}
