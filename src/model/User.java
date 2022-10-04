package model;

public abstract class User {
	private String name = "";
	private String password = "";

	public User(String userName, String userPasswprd) {
		this.name = userName;
		this.password = userPasswprd;
	}

	public String getName() {
		return this.name;
	}

	public String getPassword() {
		return this.password;
	}

}
