package oop.abstraction;

public class BMW implements Car {

	public void start() {
		System.out.println("Remote start features");
	}
	
	public void stop() {
		System.out.println("Hydrolic Break System");
	}
	
	public void wheel() {
		System.out.println("Four Wheel Driver");
	}
}
