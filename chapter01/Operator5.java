/*
	논리연산자
	논리곱	AND (&&)	그리고		참(1)
	
		0 0 ?	0
		0 1 ?	0
		1 0 ?	0
		1 1 ?	1
	
	논리합	OR  (||)	또는			거짓(0)
	
		0 0 ?	0
		0 1 ?	1
		1 0 ?	1
		1 1 ?	1

	반대		NOT (!)		아니다, 반대

*/
package c5_Operator;

public class Operator5 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 5;
		int n3 = 7;
		int n4 = 15;
		
		//and
		System.out.println(n1>n2 && n3==n4);
		
		//or
		System.out.println(false || true);
		
		//not
		System.out.println(!true);
		

	}

}
