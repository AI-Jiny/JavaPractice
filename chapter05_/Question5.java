package M;

import java.util.Scanner;

public class Question5 {

	/*
	 * 문제5. 컴퓨터와 철수가 가위바위보 게임을 하는 프로그램을 작성하시오. 가위(1), 바위(2), 보(3), 끝내기(4)*
	 */

	public static void main(String[] args) {

		String str[] = new String[3];
		str[0] = "가위";
		str[1] = "바위";
		str[2] = "보";

		System.out.println("컴퓨터와 가위바위보를 하겠습니다.");
		System.out.println("1 : 가위, 2 : 바위, 3 : 보, 4 : 종료");
		System.out.println("본인의 선택을 입력해주세요");

		// 철수의 입력

		while (true) {

			int i = (int) (Math.random() * 3 + 1); // 컴퓨터의 선택

			System.out.println("가위 바위 보!");

			Scanner sc = new Scanner(System.in);

			int j = sc.nextInt(); // 유저의 선택

			if (j > 4 || j < 1) {

				System.out.println("1~4의 숫자만 입력해주세요.");
				continue;
			}

			if (j == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (i == j) {
				System.out.println("컴퓨터 : " + str[i - 1] + " vs " + "당신 : " + str[j - 1]);
				System.out.println("******무승부 입니다.******");

			}

			else if (i - j == 1 || i - j == -2) {
				System.out.println("컴퓨터 : " + str[i - 1] + " vs " + "당신 : " + str[j - 1]);
				System.out.println("******승자는 컴퓨터입니다.******");

			} else {
				System.out.println("컴퓨터 : " + str[i - 1] + " vs " + "당신 : " + str[j - 1]);
				System.out.println("******승자는 당신입니다.******");

			}
					}

	}

}