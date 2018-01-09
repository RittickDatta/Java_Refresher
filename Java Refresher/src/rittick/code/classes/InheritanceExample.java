package rittick.code.classes;

class Employees{
	int salary = 100000;
}

public class InheritanceExample extends Employees{
	int bonus = 100;
	
	public static void main(String[] args) {
	 InheritanceExample obj = new InheritanceExample();
	 System.out.println(obj.salary);
	 System.out.println(obj.bonus);
	}
}
