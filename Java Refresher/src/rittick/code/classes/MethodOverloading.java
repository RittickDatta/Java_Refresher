package rittick.code.classes;

class Adder{
	static  int add(int a, int b){return a + b;}
	static double add(double a, double b, double c){return a + b + c;}
}

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(Adder.add(1, 2));
		System.out.println(Adder.add(1.1, 2.2, 3.3));
	}
}
