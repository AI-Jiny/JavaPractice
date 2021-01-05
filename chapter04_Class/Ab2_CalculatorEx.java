package step8_추상과인터페이스;

abstract class Calculator {

	int a = 100;

	abstract void cal(int x, int y);

	void print() {
		System.out.println("여기는 추상클래스 입니다.");
	}

}

class Add extends Calculator {
	int b;

	@Override
	void cal(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
	}

}

class Sub extends Calculator {

	@Override
	/* static */ void cal(int x, int y) {
		System.out.println(x + "-" + y + "=" + (x - y));
	}

}

public class Ab2_CalculatorEx {

	public static void main(String[] args) {
		// static 접근지정자가 붙은경우, .메소드, .필드, 등으로 바로 호출 할 수 있다.
		// Sub.스태틱 메소드명, Sub.스태틱 필드명

		// 추상 클래스는 자신의 객체를 생성할 수 없다.
		// 추상 클래스를 상속받아 구현한 다음에 객체를 생성한 후 사용해야 한다.

		Add c = new Add();
		System.out.println(c.a);
		System.out.println(c.b);
		c.cal(5, 6);

	}

}
