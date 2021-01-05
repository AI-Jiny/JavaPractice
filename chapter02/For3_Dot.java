package c3_for;

public class For3_Dot {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		
		for (i = 0; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (i = 10; i >= 0; i--) {
			System.out.print("*");
		}

		System.out.println();

		
		for(i=0;i<=10;i+=2) {
			System.out.print("*");

		}
		
		//증감조건 두개이상
		for(i=1, j=1; i<=10 && j<=99; i++, j++) {
			System.out.println("("+i+","+j+")"+"i+j="+(i+j));

			
		}
		
	}

}
