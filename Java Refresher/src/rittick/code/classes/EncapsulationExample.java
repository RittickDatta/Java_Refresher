package rittick.code.classes;

class Stu{
	private int id;
	private String name;
	
	Stu(int id, String name){
		this.id = id;
		this.name = name;
		this.display();
	}
	
	void display(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		Stu obj = new Stu(1, "Rittick");

	}

}
