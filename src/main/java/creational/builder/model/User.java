package creational.builder.model;

public class User {

	private final String name;
	private final String lastname;
	private final String email;
	private final int age;

	private User(UserBuilder builder) {
		this.name = builder.name;
		this.lastname = builder.lastname;
		this.email = builder.email;
		this.age = builder.age;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public static class UserBuilder {

		private String name;
		private String lastname;
		private String email;
		private int age;

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder lastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User{" +
			"name='" + name + '\'' +
			", lastname='" + lastname + '\'' +
			", email='" + email + '\'' +
			", age=" + age +
			'}';
	}

}
