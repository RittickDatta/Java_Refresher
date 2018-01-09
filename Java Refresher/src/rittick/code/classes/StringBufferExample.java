package rittick.code.classes;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		sb.insert(0, "K");
		sb.replace(0, 2, "IAMHERE");
		sb.delete(0, 4);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
