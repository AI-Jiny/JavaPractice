/*
	<사칙연산>
*/
package c5_Operator;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {

		System.out.println("연산하고 싶은 두개의 숫자를 입력하세요>>");
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		sc.close();

		int result;

		System.out.println("더하기 : " + (n1 + n2));
		System.out.println("빼기 : " + (n1 - n2));
		System.out.println("곱하기 : " + (n1 * n2));
		System.out.println("나누기 : " + ((float) n1 / n2));
		// 나누기 %
		System.out.println("나머지 나누기 : " + (n1 % n2));

		// 홀짝 판별

	}

}
