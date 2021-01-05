package c1_if;

import java.util.Scanner;

public class If5_PlusMinus {

	public static void main(String[] args) {

		System.out.println("확인하고 싶은 숫자를 입력해주세요>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 1) {
				System.out.println("입력하신 숫자는 양수이며, 홀수입니다.");
			} else {
				System.out.println("입력하신 숫자는 양수이며, 짝수입니다.");
			}

		} else if (num < 0) {
			if (num % 2 == -1) {
				System.out.println("입력하신 숫자는 음수이며, 홀수입니다.");
			} else {
				System.out.println("입력하신 숫자는 음수이며, 짝수입니다.");

			}
		} else {
			System.out.println("입력하신 숫자는 0 입니다.");
		}

		sc.close();
	}
}
