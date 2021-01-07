package com.qa.OOP2;

public class Motorcycle extends Vehicle {
	
	private int topSpeed;

	public Motorcycle(String model, String roadType, int modelYear, int topSpeed) {
		super(model, roadType, modelYear);
		this.topSpeed = topSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	

}
