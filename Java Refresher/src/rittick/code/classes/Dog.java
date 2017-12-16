package rittick.code.classes;

public class Dog{
	private String name;
	private int age;
	
	
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	public static void main(String[] args){
		Dog ellie = new Dog("Ellie",10);
		System.out.println(ellie.getName());
		System.out.println(ellie.getAge());
	}
}