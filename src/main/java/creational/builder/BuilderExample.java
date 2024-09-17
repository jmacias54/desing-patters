package creational.builder;

import creational.builder.model.User;

public class BuilderExample {

	public static void main(String[] args) {
		System.out.println("que pedo perro ");

		User user = new User.UserBuilder().age(22)
			.email("chustga@gmail.com")
			.lastname("Macias")
			.name("Sebastian")
			.build();

		System.out.println(" Usuario: " + user.toString());


	}
}
