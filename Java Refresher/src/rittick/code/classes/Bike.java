package rittick.code.classes;

public class Bike {
	int id;
	Bike(){
		id=0;
		System.out.println("Bike is created.");
	}
	
	Bike(int id){
		this.id = id;
		System.out.println("In Parameterized Constructor");
	}
	
	Bike(Bike b){
		id = b.id;
		System.out.println("In Copy Constructor");
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		Bike b2 = new Bike(123);
		Bike b3 = new Bike(b2);
	}
}
