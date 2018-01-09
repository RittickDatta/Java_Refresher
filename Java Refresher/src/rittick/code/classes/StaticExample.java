package rittick.code.classes;

public class StaticExample {
	int id;
	static String text = "I am static";
	
	public StaticExample(int id) {
		this.id = id;
	}
	
	void display(){
		System.out.println(id+" "+text);
	}
	
	public static void main(String[] args) {
		StaticExample se = new StaticExample(1);
		se.display();
	}
}
