package rittick.code.classes;

public class Decisions {
	public static void main(String[] args) {
		int a = -30;
		
		if(a > 0){
			System.out.println("a is greater than 0.");
		}else if (a<0){
			System.out.println("a is less than 0.");
		}else {
			System.out.println("I don't care about a");
		}
		
		char ch='c';
		
		switch(ch){
		case 'a':System.out.println("It is a.");break;
		case 'b':System.out.println("It is b.");break;
		case 'c':System.out.println("It is c.");break;
		default: System.out.println("I don't give a ...");
		}
	}
}
