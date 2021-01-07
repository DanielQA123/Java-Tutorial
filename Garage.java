package com.qa.OOP2;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> list = new ArrayList<>();

	public void addVehicle(Vehicle vh) {
		list.add(vh);

	}

	public void billCal() {

		for (Vehicle vh : list) {
			if (vh instanceof Car) {
				System.out.println("Decent Car");
			} else if (vh instanceof Bike) {
				System.out.println("Bike");
			} else {
				System.out.println("Motorcycle");
			}
		}

	}

	public void removeModel(String model) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getModel().equals(model)) {
				list.remove(i);
			}
		}
	}

	public void emptyGarage() {

		list.clear();

	}
}
