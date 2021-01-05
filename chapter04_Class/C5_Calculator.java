package step1_클래스와객체;

public class C5_Calculator {
	// 필드
	double result;
	double x, y;

	// 생성자
	// 메소드
	void add(double x, double y) {
		System.out.println("x + y = " + (int)(x + y));
	}

	void sub(double x, double y) {
		System.out.println("x - y = " + (int)(x - y));
	}

	void mul(double x, double y) {
		System.out.println("x * y = " + (int)(x * y));
	}

	void div(double x, double y) {
		System.out.println("x / y = " + (x / y));
	}

}
