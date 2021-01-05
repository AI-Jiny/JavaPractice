package step1_클래스와객체;

import java.util.Scanner;

public class C5_CalculatorEx {

	public static void main(String[] args) {

		C5_Calculator c1 = new C5_Calculator();

		System.out.println("계산하고 싶은 두개의 수를 입력하세요>>");
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		c1.add(a, b);
		c1.sub(a, b);
		c1.mul(a, b);
		c1.div(a, b);
		

		sc.close();

	}

}
