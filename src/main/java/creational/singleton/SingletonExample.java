package creational.singleton;

import creational.singleton.model.Version;
import creational.singleton.service.CarritoDeComprasService;
import creational.singleton.service.UsusarioService;

public class SingletonExample {

	public static void main(String[] args) {
		Version version = Version.getInstance();
		System.out.println("Version"+version.toString());
		UsusarioService  ususarioService =  new UsusarioService(version);
		CarritoDeComprasService  carritoDeComprasService = new CarritoDeComprasService(version);
	}
}
