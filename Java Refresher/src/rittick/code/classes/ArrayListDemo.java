package rittick.code.classes;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		System.out.println("Initial size of the ArrayList: "+al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		
		System.out.println("Size after adding elements: "+al.size());
		
		System.out.println("Contents of ArrayList: "+al);
		
		al.remove("C");
		System.out.println("Contents after a deletion: "+al);
	}
}
