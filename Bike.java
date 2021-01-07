package com.qa.OOP2;

public class Bike extends Vehicle {
	
	private char size;


	public Bike(String model, String roadType, int modelYear, char size) {
		super(model, roadType, modelYear);
		this.setSize(size);
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
	
	

}
