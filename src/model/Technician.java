package model;

public class Technician extends User {
	private int level;

	public Technician(String name, String password, int level) {
		super(name, password);
		this.setLevel(level);

	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
