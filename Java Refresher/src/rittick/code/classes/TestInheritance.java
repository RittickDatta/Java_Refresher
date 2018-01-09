package rittick.code.classes;

class Animal{
	void run(){
		System.out.println("Animal is running...");
	}
}

class Doggy extends Animal{
	void bark(){
		System.out.println("Dog is barking...");
	}
}

class Human extends Doggy{
	void eat(){
		System.out.println("Human is eating...");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		h.bark();
		h.run();
	}
}
