package rittick.code.classes;

class Bike1{
	int speedLimit = 100;
}

public class Honda3 extends Bike1{
	int speedLimit = 120;
	public static void main(String[] args) {
		Bike1 bike = new Honda3();
		System.out.println(bike.speedLimit);
	}
}
