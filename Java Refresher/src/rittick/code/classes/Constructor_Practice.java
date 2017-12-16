package rittick.code.classes;

public class Constructor_Practice {
	public Constructor_Practice() {
		System.out.println("In Default Constructor");
	}
	
	public Constructor_Practice(String arg){
		System.out.println("In a parameterized constrcutor:"+arg);
	}
	
	public static void main(String[] arg){
		Constructor_Practice obj = new Constructor_Practice();
		Constructor_Practice obj2 = new Constructor_Practice("Argument");
	}
}
