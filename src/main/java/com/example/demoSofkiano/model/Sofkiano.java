package com.example.demoSofkiano.model;

public class Sofkiano {
	private String name;
	private String lastName;
	
	public Sofkiano () {
		
	}
	
	public Sofkiano (String name, String lastName){
		this.setName(name);
		this.setLastName(lastName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
