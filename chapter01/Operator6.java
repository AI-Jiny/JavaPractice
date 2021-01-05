package c5_Operator;

public class Operator6 {

	public static void main(String[] args) {

		// 증감연산자
		int num = 10;
		num = num + 1;
		System.out.println(num);

		num += 1;
		/*
		 * 복합대입 연산자(p80참존) a += 1 -->a = a+1 a *= 1 -->a = a*1 a /= 1 -->a = a/1 a %= 1
		 * -->a = a%1
		 */ System.out.println(num);

		num *= 3;
		System.out.println(num);

		num /= 2;
		System.out.println(num);

		num %= 2;
		System.out.println(num);

	}
}
