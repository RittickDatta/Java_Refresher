package rittick.code.classes;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		
		int b = a.valueOf(a);
		int c = a;
		System.out.println(c);
	}
}
