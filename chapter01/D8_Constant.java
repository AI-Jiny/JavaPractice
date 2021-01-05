/*
	상수(변하기 않는 값)
		-반복적으로 사용하고 변하기 않아야 하는 값을 상수로 선언해둔다.
*/
package c4_package;

import java.util.Scanner;

public class D8_Constant {

	public static void main(String[] args) {

		final double PI = 3.14;
		///double radius = 10; 원의 반지름
		double circleArea = 0; // 원의 면적
		double circleLength = 0;
		
		System.out.println("원의 반지름을 입력해주세요>>");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		circleArea = radius * radius * PI;
		circleLength = radius * 2 * PI;
		
		sc.close();
		
		System.out.println("원의 면적 : "+circleArea);
		System.out.println("원의 둘레 : "+circleLength);
		System.out.printf("원의 둘레 : %.1f", circleLength);
	}

}
