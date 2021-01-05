package c1_if;

import java.util.Scanner;

public class If_Score {

	public static void main(String[] args) {
		String grade = null;

		System.out.println("점수를 입력해 주세요>>");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		if (score >= 90) {

			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A-";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B-";
			}

		} else if (score >= 70) {
			grade = "C";

		} else {
			grade = "D";
		}
		sc.close();
		System.out.println("당신의 성적은 " + grade + "입니다.");
	}

}
