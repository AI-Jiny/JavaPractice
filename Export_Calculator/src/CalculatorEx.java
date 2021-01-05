

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("연산하고 싶은 메뉴 번호를 입력해주세요>>");
			System.out.println("1 : 덧셈, 2 : 뺄셈, 3 : 곱셈, 4. 나눗셈, 종료 : 5");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("연산하고 싶은 두 숫자를 입력해주세요>>");

				add.a = sc.nextInt();
				add.b = sc.nextInt();

				System.out.println(add.a + "+" + add.b + "=" + add.calculate());
				break;
			case 2:
				System.out.println("연산하고 싶은 두 숫자를 입력해주세요>>");

				sub.a = sc.nextInt();
				sub.b = sc.nextInt();

				System.out.println(sub.a + "-" + sub.b + "=" + sub.calculate());
				break;
			case 3:
				System.out.println("연산하고 싶은 두 숫자를 입력해주세요>>");

				mul.a = sc.nextInt();
				mul.b = sc.nextInt();

				System.out.println(mul.a + "x" + mul.b + "=" + mul.calculate());
				break;
			case 4:
				System.out.println("연산하고 싶은 두 숫자를 입력해주세요>>");

				div.a = sc.nextInt();
				div.b = sc.nextInt();

				System.out.println(div.a + "/" + div.b + "=" + (double) div.calculate());
				break;
			case 5:
				System.out.println("계산기를 종료합니다.");
				break;

			}

			if (num == 5)
				break;

		}
		sc.close();
	}

}
