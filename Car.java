package com.qa.OOP2;

public class Car extends Vehicle {
//new attribute
	private String carColour;
	

	//new constructor
	public Car(String model, String roadType, int modelYear, String carColour) {
		super(model, roadType, modelYear);
		this.carColour = carColour;
	}
	
	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
	
}



