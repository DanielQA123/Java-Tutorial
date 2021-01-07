package com.qa.OOP2;

public class Vehicle {
	private String model;
	private String roadType;
	private int modelYear;
	//Attributes

	public Vehicle(String model, String roadType, int modelYear) {
		super();
		this.model = model;
		this.roadType = roadType;
		this.modelYear = modelYear;
	}

	public Vehicle() {
	// empty constructor
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", roadType=" + roadType + ", modelYear=" + modelYear + "]";
	}

}
