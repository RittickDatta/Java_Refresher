package rittick.code.classes;

public class ArrayClassname {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		Class c = arr.getClass();
		String className = c.getName();
		
		System.out.println(className);
	}
}
