/*

	1. 이름작명법
		패키지: 모두 소문자
		클래스명: 대문자대문자
		변수명: 소대문자
		메소드: 소문자
		상수: 대문자
		
	2. 식별자 규칙
		첫글자는 숫자불가
		한글도 가능
		if, while, class등 자바의 예약된 단어는 사용 불가
		true, false, null사용불가
		길이제한 없다
		대소문자 구분됨
		
	3. CLASS
		자바의 프로그램 단위
		구성요소
			전역변수(필드)
			생성자
			메소드

*/
package c2_기본문법;

public class Java기본문법 {

	// 필드
	int x;
	int y;

	// 생성자
	Java기본문법(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드
	void addCalculator() {
		int sum = 0;
		sum=x+y;
		System.out.println("합 : "+sum);
	}
	
	//실행메소드
	public static void main(String[] args) {
		
		Java기본문법 myCal = new Java기본문법(1, 2);
		
		myCal.addCalculator();
	}

}
