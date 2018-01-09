package rittick.code.classes;

public class Student {
	String name;
	int age;
	
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "Rittick";
		st.age = 27;
		System.out.println(st.name+" is "+st.age+" years old.");
	}
}
