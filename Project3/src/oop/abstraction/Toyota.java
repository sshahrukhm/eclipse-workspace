package oop.abstraction;

public class Toyota implements Car, ElectricCar {

	public void start() {
		System.out.println("start the car");
	}
	public void stop() {
		System.out.println("press the break to stop the car");
	}
	public void wheel() {
		System.out.println("car should run on wheels");
	}
	public void motorVehicle() {
		System.out.println("run on engine");
	}
	public void engineRunByBattery() {
		// TODO Auto-generated method stub
		
	}

}
