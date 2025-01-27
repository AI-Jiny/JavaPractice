package practice_test;

import java.util.Scanner;

public class Ex4_369game {

	public static void main(String args[]) {

		int res, num, numberOf369 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력해주세요>>");
		num = sc.nextInt();

		if (num >= 1 && num <= 99) {
			// 3.6.9에 해당하는지 우선 10으로 나누어서 확인
			res = num / 10;
			if (res == 3 || res == 6 || res == 9) {
				numberOf369++;
			}
			res = num % 10;
			if (res == 3 || res == 6 || res == 9) {
				numberOf369++;
			}

		}
		// 박수출력
		if (numberOf369 == 1) {
			System.out.println("박수 짝");
		} else if (numberOf369 == 2) {
			System.out.println("박수 짝짝");
		} else {
			System.out.println("3,6,9에 해당 박수가 없습니다.");
		}

		sc.close();
	}

}
