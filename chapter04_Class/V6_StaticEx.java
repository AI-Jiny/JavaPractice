package step2_Variable;

class Static {
	// 필드
	int a = 7;
	static int b = 10;

	// 인스턴스(객체) 메소드
	void print1() {
		System.out.println("a = " + a + ", b = " + b);
	}

	// 클래스 메소드
	static void print2() {
		System.out.println("*^^*");
	}

	static void print3() {
		System.out.println("b : " + b);
	}
}

public class V6_StaticEx {

	public static void main(String[] args) {
		Static.b = 100;
		Static.print2();
		Static.print3();
		
		
		Static st = new Static();
		
		
		st.a=10;
		st.b=200;
		
		st.print3();
		Static.print3();

	}

}
