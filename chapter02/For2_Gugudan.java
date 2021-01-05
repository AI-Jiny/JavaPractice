/*
		구구단
			.구구단 = 단*수;
*/
package c3_for;

public class For2_Gugudan {

	public static void main(String[] args) {

		System.out.println("구구단을 출력합니다.");
		System.out.println("---------------");

		for (int i = 1; i <= 9; i++) {
			System.out.println("<<< " + i + "단 >>>");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println();
		}

	}

}
