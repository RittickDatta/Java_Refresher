package rittick.code.classes;

abstract class Shape{
	abstract void draw();
}


class Rectangle extends Shape{
	void draw(){
		System.out.println("A Rectangle.");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("A Circle");
	}
}

public class TestAbstraction1 {
	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
	}
}
