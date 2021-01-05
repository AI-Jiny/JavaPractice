/*
	예외란? 프로그램 실행중에 런타임 오류의 발생을 응용 프로그램에게 알리는 행위이다.
	
	*컴파일 오류	:	코드작성중 실수로 발생하는 오류로, 실행중 프로그램이 의도하지 않은 동작을 한다.
	*실행 오류		:	프로그램이 실행되고 있는 동안의 동작중에
	*				1)시스템오류 : 동적메모리가 없는 경우나 스텍메모리의 오버플로우 등>>>제어불가
	*				2)에외 : 사용자 프로그램레에서 try_catch메소드를 이용하여 제거할 수 있는 실행 오류
	*프로그램 실핼 중 예외가 발생할 떄, 프로그램에서 예외처리를 따로 하지 않으면 프로그램은 강제 종료된다.
	*
						Throwable
						
			---------------------------------
			|								|
		  Error							Exception
	시스템에서 발생하는 오류  						|
								-------------------------
								|						|
							IOException			RuntimeException
						   (입출력 예외처리)		(실행 오류 예외 처리)
						   		|						|
					  FileNotFoundException		ArithmeticException
					  	  socktException	  IndexOutOfBoundException
			
--------------------------------------------------------------------------------------
		예외가 발생하는 경우												예외타입
--------------------------------------------------------------------------------------
	1. 정수를 0으로 나누었을 경우										ArithmeticException
	2. null레퍼런스를 참조할 때										NullPointerException
	3. 반환할 수 없는 타입으로 객체를 변환할 때								ClassCastException
	4. 메모리가 부족한 경우											OutOfMemoryException
	5. 배열의 크기보다 큰 인덱스로 접근할 때								ArrayIndexOutOfBoundsException
	6. 잘못된 인자 전달 할때											IllegalargumentException
	7. 입출력 동작 실패 또는 인터럽트 시									IOException
	8. 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환할 때				NumberFormatException
	9. Scanner클래스의 nextInt()를 호출하여 정수로 입력받고자 하였으나 		InputMismatchException
	   'a'등과 같의 문자가 입력되었을 때
			
			
	try{
		예외가 발생할 수 있는 실행문;
	}catch() {
	
	}finally{
		
	}
*/
package c2_Exception;

import java.util.Scanner;

public class E1_ArithmeticException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int divisor; // 분모
		int dividend; // 분자

		System.out.println("분자를 입력해 주세요>>");
		dividend = sc.nextInt();

		System.out.println("분모를 입력해 주세요>>");
		divisor = sc.nextInt();

		try {

			System.out.println(dividend + "/" + divisor + "=" + (dividend / divisor));

		} catch (ArithmeticException e) {
			System.out.println("분모에 0이 아닌 다른 수를 입력하세요.");

		}

		sc.close();
	}

}
