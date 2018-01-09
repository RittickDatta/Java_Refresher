package rittick.code.classes;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		arr[0] = 6;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[][] arra = new int[3][3];
		
		for(int i=0; i<arra.length; i++){
			for(int j=0; j<arra.length; j++){
				arra[i][j] = i + j;
				System.out.println(arra[i][j]);
			}
		}
		
	}
}
