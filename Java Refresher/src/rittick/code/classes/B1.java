package rittick.code.classes;

class A1{
	static final int a;
	static{a=1;}
	A1 get(){
		return this;
	}
	
	final void display(){
		System.out.println("Final Method.");
	}
}

public class B1 extends A1{
	{System.out.println("Instance Initializer Block Invoked");}
	
	final int x = 100;
	
	B1 get(){
		return this;
	}
	
	void message(){
		System.out.println("Welcome to covariant type.");
	}
	
	public static void main(String[] args) {
		new B1().get().message();
	}
}
