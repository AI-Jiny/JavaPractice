/*
	멤버 접근 지정자 (멤버 :  메소드, static이 안붙은 변수)
		. private	:	선언된 클래스 안에서만 접근 가능하다.
		. default	:	같은 패키지 안에서만 접근 가능하다.
		. protected	:	같은 패키지에서 모두 접근
						+ 상속관계의 자식이라면 다른 패키지에서도 접근 가능하다.
		. public	:	다른패키지에서도 접근 가능하다.
*/


package step6_접근지정자;


public class C2_메소드접근지정자 {
	
	public static void main(String[] args) {
		
		B a = new B();
		a.n = 7;		//public접근 지정자의 n변수 접근가능
		a.g();			//public접근 지정다의 g() 사용가능
		
	}
	
	

}
