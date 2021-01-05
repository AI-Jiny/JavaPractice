package c3_print;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {

		System.out.println("이름과 나이, 몸무게를 공란으로 구분해서 입력해 주세요>>");

		Scanner sc = new Scanner(System.in);

		String name = sc.next(); // 문자
		int age = sc.nextInt(); // 정수
		double weight = sc.nextDouble(); // 실수

		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("몸무게 : "+weight);

		sc.close();
	}

}
