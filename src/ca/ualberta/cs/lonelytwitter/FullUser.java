package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class FullUser {
	private String name;
	private String gender;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public FullUser(String name, String gender, Integer age) throws IOException {
		super();
		this.name = name;
		this.gender = gender;
		if (age > 100) {
			throw new IOException("You are too old!");
		}
		this.age = age;
	}
	
}
