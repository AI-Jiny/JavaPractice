package c3_for;

public class For4 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("다른모양을 출력해보자");

		for (int k = 0; k < 5; k++) {
			for (int h = 0; h < 5 - k; h++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 0; a < 5; a++) {

			for (int b = 0; b < a; b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < 5 - a; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
