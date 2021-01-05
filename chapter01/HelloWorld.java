package c1_welcome;

public class HelloWorld {
	
	public static void main(String[] args) {//jvm은 main()메소드를 찾아서 가장 먼저 실행한다.
											//main()메소드는 지정 형태를 지켜야 한다.
		
		
		System.out.println("안녕 세계야");
		
		//system : java에서 제공하는 시스템관련 클래스
		//.(Dot) : 오른쪽에서 왼쪽으로 접근시키는 접근 연산자
		//println() : 화면에 자동 줄바꿈이 되는 출력을 하라는 메소드
		//print() : 줄바꿈 X
		//printf("%s %b %c %d %f, ) : 문자형식을 지정해서 출력을 하라는 메소드(줄바꿈X)
		
		System.out.println(10+20+30); //+는 숫자는 연산을, 문자는 결합 처리를 한다.
		System.out.print("10+20+30");
		System.out.println("오늘은"+"태풍이 온다고 합니다.");
		
		System.out.printf("%s의 학점은 %c이고 점수는 %d입니다.", "국어", 'A', 90);
		//%s:문자	%c:문자	%d:정수	%f:실수
	}

}
