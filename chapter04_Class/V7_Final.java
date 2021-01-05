/*
	final변수
		- final은 중간에 변경이 불가능하고, 변수명을 대문자로만 만들기를 권장한다.
		- 기능
			. 객체 생성 후 실행 중에 값을 변경 할 수 없는 것을 선언할 때 사용한다.
			. final 선언된 메소드는 오버라이딩 시킬 수 없다.
			. final 클래스는 상속 될 수없다.
		
*/
package step2_Variable;

class Final {
	int a = 7;
	final int ABC = 10;
}

public class V7_Final {

	public static void main(String[] args) {
		
		//객체 생성
		
		Final f = new Final();
		
		//a값과 ABC값을 변경
		f.a =10;
		//f.ABC =100;
		
		//출력
		System.out.println("a값 : "+f.a+", ABC값 : "+f.ABC);
		
	}
}
