package rittick.code.classes;

interface walkable{
	public void walk();
}

interface sleepable{
	public void sleep();
}

public class OldPerson implements walkable, sleepable{
	public void walk(){
		System.out.println("Old man walks.");
	}
	
	public void sleep(){
		System.out.println("Old man sleeps.");
	}
	
	public static void main(String[] args) {
		OldPerson obj = new OldPerson();
		obj.walk();
		obj.sleep();
	}
}
