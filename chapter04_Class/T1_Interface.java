/*
	Interface(표준화) : 상수, 추상메소드, 디폴트메소드, 프라이빗메소드
		- 상속관계가 아닌 클래스들이 가지는 공통적인 메소드를 따로 떼어내어 하나의 인터페이스로 정의할 수 있다.
		- 객체 생성 X, 레퍼런스 변수 선언은 O
		- 클래스가 구현해야 할 메소드들이 선언되는 추상형
		- 멤버 변수(필드) 선언 불가, 상수만 선언 가능 public static final : 생략 가능
		- 구현된 메소드는 default 선언
		- private메소드는 인터페이스 내에서 작성되어야함, 인터페이스 내에 있는 다른 메소드에 의해서만 호출 가능
		- public abstract : 생략 가능
		- 같이 사용하는 공간, 제일 먼저 올라와서 실행되는 데이터 : static
		
	Interface의 역할
		* 양식의 역할을 해준다.
			- 인터페이스를 사용하면 똑같은 양식을 써야하고, 한번 작성해 놓으면 바꿀수가 없다.
		* 다중 상속을 지원한다.
			- A implement B,C
		* 클래스와 클래스를 연결, 접속시켜준다
		* 내부와 외부를 연결시켜주는 교량 역할을 한다.
		
	Interface 구현
		* 인터페이스를 상속받는 클래스는 인터페이스의 모든 추상메소드 반드시 구현
		
*/
package step8_추상과인터페이스;

interface Inter1 {

	public static final int a = 3;

	public abstract void display();

	public abstract void print();
}

interface Inter2 extends Inter1 {

	String str = "난 문자야";

	void display1();

	void print1();

}

class D1 implements Inter2 {

	@Override
	public void display() {
		System.out.println("난 재정의 된 메소드야");
	}

	@Override
	public void print() {
		System.out.println("나도 재정듸 된 메소드야");
	}

	@Override
	public void display1() {
		System.out.println(str);
	}

	@Override
	public void print1() {
		System.out.println("나도 재정의 됐지용");
	}

	public void print2() {
		System.out.println("난 추가된 메소드야");
	}

}

public class T1_Interface {

	public static void main(String[] args) {

		D1 d = new D1();
		Inter1 inter = new D1();
		inter.display();
		inter.print();

		Inter2 inter2 = new D1();
		inter2.display1();
		inter2.print1();
		d.print2();

	}

}
