package step1_클래스와객체;

public class C4_PlusMinusEx {
	
	public static void main(String[] args) {

		C4_PlusMinus myCal1 = new C4_PlusMinus();

		String sum = myCal1.plus(10, 50);
		System.out.println(myCal1.plus(10, 50) + " " + sum);

		
		System.out.println(myCal1.minus(100, 25));

	}


}
