package rittick.code.classes;

public class GenericBox<T> {
	private T t;
	
	public void add(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public static void main(String[] args){
		GenericBox<Integer> intBox = new GenericBox<Integer>();
		GenericBox<String> strBox = new GenericBox<String>();
		
		intBox.add(10);
		strBox.add("Champ");
		
		System.out.printf("Integer value: %d\n\n", intBox.get());
		System.out.printf("String value: %s\n\n", strBox.get());
	}
}
