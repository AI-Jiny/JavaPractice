/*
	변수 :  데이터를 저장하는 그릇, 데이터(값 or 주소값)이 저장된다.
		프로그램이 연산을 하면서 중간의 값들을 저장하는데 활용된다.
		
	변수에는 타입이 있다.
		-기본 데이터 타입
			.논리타입	 : 	boolean		1byte	(8bit)
			
			.문자타입	 : 	char		2byte	(유니코드 UTF8, UTF16)
																<숫자 범위>		
			.정수타입	 : 	byte		1byte						-128 ~ 127
						short		2byte						-32,768 ~ 32,767
						int			4byte	(default=기본설정)	-2,147,483,648 ~ 2,147,483,647
						long		8byte	(끝에l을 붙임)
						
			.실수타입	 :	float		4byte	(끝에f를 붙임)
						double		8byte	(default=기본설정)
						
			*해당 타입의 범위를 벗어나면 에러가 발생한다.
		
		-참조 변수 타입 : 배열, 클래스, 인터페이스 등이 속한다.
*/
package c4_package;

public class D1_DataType {
	
	public static void main(String[] args) {
		
		//byte
		byte a = 127;
		System.out.println("127을 저장한 byte값은 "+a);
		
		//short
		short b = 32767;
		System.out.println("32767을 저장한 short값은 "+b);
		
		//int
		int c = 2147483647;
		System.out.println("2147483647을 저장한 int값은 "+c);

		//long
		long d = 9223372036854775807L;
		System.out.println("9223372036854775807을 저장한 long값은 "+d);

		
	}

}
