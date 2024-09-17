package creational.singleton.database;


/*
 * 1.- Tiene que tener un construnctor privado
 * 2.- atributos privados staticos
 * 3.- metodo estatico que regrese la instancia
 *
 *
 *
 * */
public class DataBaseConnector {

	private static DataBaseConnector instance;

	private DataBaseConnector() {
		System.out.println("Creating Object ");
	}

	public static DataBaseConnector getInstance() {
		if(instance == null) {
			instance = new DataBaseConnector();
		}
		return instance;
	}
}
