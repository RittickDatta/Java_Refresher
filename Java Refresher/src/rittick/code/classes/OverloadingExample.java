package rittick.code.classes;

public class OverloadingExample {
	public static void main(String[] args) {
		System.out.println(greater(1, 2));
		System.out.println(greater(10.0, 20.0));
	}

	private static int greater(int d, int e) {
		// TODO Auto-generated method stub
		int greater;
		if (d > e){
			greater = d;
		} else {
			greater = e;
		}
		return greater;
	}
	
	private static double greater(double d, double e) {
		// TODO Auto-generated method stub
		double greater;
		if (d > e){
			greater = d;
		} else {
			greater = e;
		}
		return greater;
	}
	
	
}
