package step8_추상과인터페이스;

interface E1 {
	void aa();

}

interface E2 extends E1 {
	void bb();

}

interface E3 extends E2 {
	void cc();

}

class E4 implements E3 {

	@Override
	public void bb() {
		System.out.println("bb메소드");
	}

	@Override
	public void aa() {
		System.out.println("aa메소드");
	}

	@Override
	public void cc() {
		System.out.println("cc메소드");
	}
}

public class T2_Interface {
	public static void main(String[] args) {

		// 업캐스팅
		E3 e3 = new E4();
		
		E2 e2 = new E4();
		
		E1 e1 = new E4();
		
		
	
		

		// 메소드 호출 - 오버라이딩(동적바인딩)
		e1.aa();
		e2.aa();
		e2.bb();
		e3.aa();
		e3.bb();
		e3.cc();

	}
}
