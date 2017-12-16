package rittick.code.classes;

public class Loops {
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0; i<arr.length; i++){
			//XSystem.out.println(arr[i]);
		}
		
		int i=0;
		while(i<arr.length){
			//System.out.println(arr[i]);
			i += 1;
		}
		
		i=0;
		do{
			System.out.println(arr[i]);
			i += 1;
		}while(i < arr.length);
	}
}
