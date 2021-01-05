package step7_Extends;

class A3 {

	A3() {
		System.out.println("생성자 A");
	}
}

class B3 extends A3 {
	B3() {
		System.out.println("생성자 B");
	}

	B3(int x) {
		System.out.println("매개변수 있는 생성자1");
	}
}

class C3 extends B3 {

	C3() {
		System.out.println("생성자 C");
	}

	C3(int x) {
		System.out.println("매개변수 있는 생성자2");
	}

	void print() {
		System.out.println("생성자 우선순위에 대한 학습을 합니다.");
	}
}

public class E4_생성자우선순위 {

	public static void main(String[] args) {
		C3 obj1 = new C3(3);

		C3 obj2 = new C3();
	}

}
