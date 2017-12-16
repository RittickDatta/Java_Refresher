package rittick.code.classes;

class FreshJuice{
	enum FreshJuiceSize{SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}
/*
 * Class Comment
 */
public class FreshJuiceTest {
	/***
	 * Method Comment
	 * @param args
	 */
public static void main(String[] args){
	FreshJuice juice = new FreshJuice();
	juice.size = FreshJuice.FreshJuiceSize.LARGE;
	System.out.println("Size: "+juice.size);
}
}
