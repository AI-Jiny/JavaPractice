/*
	비트연산자
		. 논리연산자와 비슷하나 하는 일을 완전히 다름
		. 비트를 사용해서 연산하는 연산자이다.
		. 정수와 정수형태의 연산만 가능하다.
		
		AND(&) :	1 1	-> 1
		O R(|) :	0 0 -> 0
		XOR(^) :	0 0 -> 0, 1 1 -> 0, 1 0 / 0 1 -> 1

*/package c5_Operator;

public class Operator7 {

	public static void main(String[] args) {

		int n1 = 10; // 01010
		int n2 = 5; // 00101 >> 00000
		int result = n1 & n2;
		System.out.println(result);

		result = n1 | n2;
		/*
		 * int n1 = 10; // 01010 
		 * int n2 = 5;  // 00101 >> 01111 */ 
		System.out.println(result);

		result = n1 ^ n2;
		/*
		 * int n1 = 10; // 01010 
		 * int n2 = 5;  // 00101 >> 01111 */ 
		System.out.println(result);

	}

}
