package c4_package;

import java.util.Scanner;

public class D6_Boolean {

	public static void main(String[] args) {

		boolean a = true;
		System.out.println("boolean변수 a의 값 : " + a);
		boolean b = 10 > 20;
		System.out.println("boolean변수 b의 값 : " + b);
		boolean c = a;
		System.out.println(c);

		System.out.println("액셀레이터의 조건값을 입력해주세요>>");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		boolean stop = i < j;
		if (stop) {
			System.out.println("자동차를 멈춥니다.");
		} else {
			System.out.println("계속 달립니다.");
		}
		sc.close();
	}

}
