package com.qa.OOP2;

public class Runner {
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car = new Car("Lambo", "SuperCar",2017, "Navy");
		Car car2 = new Car("VW","RoadCar",2019, "Red");
		
		Motorcycle mt = new Motorcycle("Hyaundi", "Race", 2015, 200);
		Motorcycle mt2 = new Motorcycle("Yahama", "Race and Road", 2020, 175);
		
		Bike bk = new Bike("Carrera","mountain", 2019,'M');
		Bike bk2 = new Bike("Voodoo","BMX and Road", 2018,'L');
		
		
		garage.addVehicle(car);
		garage.addVehicle(car2);
		garage.addVehicle(mt);
		garage.addVehicle(mt2);
		garage.addVehicle(bk);
		garage.addVehicle(bk2);
		
		System.out.println(garage.list);
		
		garage.removeModel("Yahama");
		System.out.println(garage.list);
	}

}
