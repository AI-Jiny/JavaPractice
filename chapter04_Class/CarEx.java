package step9_포함관계;

class Engine {
	String type;
	int cc;

	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}

	void print() {
		System.out.println("타 입 : " + type);
		System.out.println("배기량 : " + cc + "cc");
	}
}

class Car {
	String kind;
	Engine eg; // Engine클래스 객체레퍼런스 선언

	public Car(String kind, Engine eg) { // 생성자에 Engine클래스를 매개변수로 받는다.
		this.kind = kind;
		this.eg = eg;
	}

	void print() {
		System.out.println("차 종 : " + kind);
		eg.print(); // 포함시킨 객체의 메소드 호출
		System.out.println("=================");
	}
}

public class CarEx {

	public static void main(String[] args) {

		Engine eg1 = new Engine("알파엔진", 2000);
		Engine eg2 = new Engine("베타엔진", 3000);
		Engine eg3 = new Engine("뉴엔진", 4000);

		Car c1 = new Car("그랜져", eg1);
		Car c2 = new Car("모닝", eg2);
		Car c3 = new Car("소나타", eg3);

		c1.print();
		c2.print();
		c3.print();

	}

}
