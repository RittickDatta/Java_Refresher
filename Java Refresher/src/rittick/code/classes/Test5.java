package rittick.code.classes;

interface A11{
	void a();
	void b();
	void c();
}

abstract class B implements A11{
	public void c(){
		System.out.println("I am c");
	}
}

class M extends B{
	public void a(){
		System.out.println("I am a");
	}
	
	public void b(){
		System.out.println("I am b");
	}
}

public class Test5 {
	public static void main(String[] args) {
		M obj = new M();
		obj.a();
		obj.b();
		obj.c();
	}
}
