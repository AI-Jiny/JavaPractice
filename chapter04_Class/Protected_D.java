/*package step6_접근지정자;

import back.Protected_A;

class Protected_B extends Protected_A {

	protected int b;

	protected void b() {
		b = 5;
		a = 50;
		a();
		printA();
	}

	protected void printB() {
		System.out.println("여기는 B입니다.");
	}

}

class Protected_C extends Protected_B {

	void f() {
		b = 3;
		b();
		printB();
		a();
	}

}

public class Protected_D extends Protected_A {
	
	void f() {
		a();	//접근가능
	}
	//상속관계에 있는 클래스
	

	public static void main(String[] args) {

		Protected_C c = new Protected_C();

		c.b = 7; // 같은 패키지 활용가능
		c.b();
		c.printB();
		
		
		//객체에는 접근이 안됨
//		c.a();
		c.printA();
		

	}

}
*/