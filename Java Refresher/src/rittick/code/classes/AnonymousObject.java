package rittick.code.classes;

public class AnonymousObject {
	int i =10;
	
	void display(){
		System.out.println("Anonymous");
	}
	
	public static void main(String[] args) {
		new AnonymousObject().display();
		
		AnonymousObject a1 = new AnonymousObject(), a2 = new AnonymousObject();
		a1.display();
		a2.display();
	}
}
