package creational.singleton.service;

import creational.singleton.model.Version;

public class UsusarioService {


	private Version version;

	public UsusarioService(Version version) {
		System.out.println(" UsusarioService Version"+version.toString());

		this.version = version;
	}
}
