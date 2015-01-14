package ca.ualberta.cs.lonelytwitter;

public class Favourites {
	
	private String f_name;

	public String getName() {
		return f_name;
	}

	public void setName(String name) {
		this.f_name = name;
	}

	public Favourites(String f_name) {
		super();
		this.f_name = f_name;
	}
	
}
