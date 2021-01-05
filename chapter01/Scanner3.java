package c3_print;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {

		System.out.println("이름, 도시, 나이, 체중을 입력해 주십시오>>");

		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();

		System.out.println("이름 : " + name);
		System.out.println("도시 : " + city);
		System.out.println("나이 : " + age);
		System.out.println("체중 : " + weight);

		sc.close();

	}

}
