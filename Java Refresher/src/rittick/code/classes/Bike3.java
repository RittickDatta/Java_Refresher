package rittick.code.classes;

abstract class Vehicle1{
	abstract void start();
}

public class Bike3 extends Vehicle1{
	void start(){
		System.out.println("Starting...");
	}
	
	public static void main(String[] args) {
		Bike3 obj = new Bike3();
		obj.start();
	}

}
