/*
	싱글톤 패턴이란?
		. 객체지향 프로그램에서 인스턴스(객체)를 단 하나만 생성하는 디자인 패턴을 말한다.
		. static을 응용하여 싱글톤 패턴을 구현할 수 있다.
*/

package step6_접근지정자;

class Company {

	// 멤버변수
	private static Company instance;

	// 생성자
	private Company() {

	}

	// 메소드
	public static Company getInstance() {

		if (instance == null) {
			instance = new Company(); // 없으면 객체를 생성해라
		}
		
		return instance; // 외부에서는 유일하게 여기를 통해서만 객체를 생성 할 수있다.

	}

}

public class C3_Singletone {

	public static void main(String[] args) {

		// Company c = new Company(); -컴파일 오류(생성자로 객체 생성 불가)

		Company c1 = Company.getInstance(); // get메소드 호출해서 객체 생성

	}

}
