/*
	전위증감연산자(prefix), 후위증감연산자(postfix)
*/
package c5_Operator;

public class Operator2 {

	public static void main(String[] args) {

		int a = 5;
		int b = 2;

		int sum = a + b;
		System.out.println("a+b = " + sum);

		int opr1 = a - b;
		int opr2 = a * b;
		double opr3 = a / (double) b;
		int opr4 = a % b;

		System.out.println("a-b = " + opr1);
		System.out.println("a*b = " + opr2);
		System.out.println("a/b = " + opr3);
		System.out.println("a%b = " + opr4);

		
		int c1 = ++a;	//a=a+1
		System.out.println("전위증감연산자 c1의 값은 몇일까요? : " + c1);
		System.out.println("현재 a의 값은? : " + a);

		int c2 = a++;	//a=a, a+1

		System.out.println("후위증감연산자 c1의 값은 몇일까요? : " + c2);
		System.out.println("현재 a의 값은? : " + a);

		//현재 b는 2
		
				
		
	}

}
