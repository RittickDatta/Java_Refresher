package rittick.code.classes;

class A{
	public void a(){
		System.out.println("Outer method.");
	}
}

public class OverridingExample extends A{
	public void a(){
		System.out.println("Inner method.");
	}
	
	public static void main(String[] args) {
		OverridingExample obj = new OverridingExample();
		obj.a();
	}
}
