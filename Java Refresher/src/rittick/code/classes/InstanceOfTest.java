package rittick.code.classes;

class Car{}

public class InstanceOfTest {
	static String name="Rittick";
	static boolean flag = name instanceof String;
	public static void main(String[] args) {
		System.out.println(flag);
		
		Car car = new Car();
		System.out.println(car instanceof Car);
	}
			
}
