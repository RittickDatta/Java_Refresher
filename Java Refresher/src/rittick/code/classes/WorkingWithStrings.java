package rittick.code.classes;

public class WorkingWithStrings {
	public static void main(String[] args) {
		String s = " Hello World ";
		String s1 = "A";
		String s2 = s1;
		int a = 10;
		String b = String.valueOf(a);
		
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.substring(1, 3));
		System.out.println(s.contains("o"));
		System.out.println(s.equals("hello"));
		System.out.println(s.isEmpty());
		System.out.println(s.concat(" World"));
		System.out.println(s.split(" "));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.replace('e', 'b'));
		System.out.println(s.equalsIgnoreCase(" hellO wOrld "));
		System.out.println(s1 == s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(b);
	}
}
