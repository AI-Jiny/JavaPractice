/*
	this	:	내 자신의 객체를 가르킴
	this()	:	내 자신의 생성자를 호출함, 반드시 생성자 속에서 첫줄에 사용해야 함

	super	:	부모의 객체를 가르킴
	super()	:	부모의 생성자를 호출함, 반드시 생성자 속에서 첫줄에 사용해야함

*/
package step7_Extends;

class A4 {
	int n = 5;
	int k = 7;

//	public A4() {
//		System.out.println("1. 부모의 기본생성자");
//	}

	A4(int i) {
		System.out.println("매개변수 있는 부모생성자");
	}// 상속 관계일때는 기본생성자가 따로 자동으로 생성 되지 않는다. 따라서 임의적으로 생성해줘야한다.

	void display() {
		System.out.println("불금이당");
	}

	void print() {
		System.out.println("부모 메소드 :D");
	}
}

class A5 extends A4 {
	int n = 10;
	int k = 100;

	public A5() {
		super(3); // 부모 클래스의 기본생성자를 쓰고싶지 않을경우, 매개변수있는 부모의 생성자를 호출한다.
		System.out.println("2. 자식의 기본생성자");
	}

	void print() {
		super.print(); // 부모의 print메소드 호출
		System.out.println("자식 멤버의 a = " + n); // 내 자신의 n호출
		System.out.println("부모 멤버의 a = " + super.n); // 부모의 n호출
	}
}

public class E6_Super {

	public static void main(String[] args) {

		A5 a = new A5();

		a.print(); // 부모에도 있고 자식에도 있고 ->자식것을 호출함
		a.display(); // 부모에 있는 메소드
	}
}
