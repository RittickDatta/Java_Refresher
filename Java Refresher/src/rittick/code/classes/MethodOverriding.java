package rittick.code.classes;

class Vehicle{
	void run(){
		System.out.println("vehicle is running.");
	}
}

public class MethodOverriding extends Vehicle{
	void run(){
		System.out.println("Method Overriden.");
	}
	
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.run();
	}
}
