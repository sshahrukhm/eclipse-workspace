package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.start();
		car.wheel();
		car.stop();
		
		Toyota Camry = new Toyota();
		Camry.motorVehicle();
		Camry.engineRunByBattery();
		
		ElectricCar model3 = new Toyota();
		model3.engineRunByBattery();
		
		BMW series5 = new BMW();
		series5.start();
		series5.wheel();
		series5.stop();

	}

}

