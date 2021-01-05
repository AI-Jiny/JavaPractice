package step7_Extends;

class A {

	public int p;
	private int n;

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

}

class B extends A {

	private int m;
	private int n;

	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public String toString() {
		return super.getN() + ", " + this.getM();
		//		부모					 본인
	}

}

public class E3_SuperSubEx {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		a.p = 6;
		//a.n = 5; // 접근불가

		b.p = 7;
		//b.n = 8; // 접근불가

		b.setN(10);

		//b.m = 20; // 접근불가
		b.setM(10);

		System.out.println(b.toString());
	}
}
