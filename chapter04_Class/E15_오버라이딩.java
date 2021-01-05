package step7_Extends;

class Car {
	int a = 7;

	void move() {
		System.out.println("주행합니다.");
	}
}

class Bus extends Car {
	int a = 25;

	public void move() {
		System.out.println("40명을 태우고 주행합니다.");
	}

}

class Ambulance extends Car {
	void move() {
		System.out.println("사이렌을 울리면서 주행합니다.");
	}

	void special() {
		System.out.println("환자를 태우고 있습니다.");
	}
}

class FireEngine extends Car {
	int a = 11;

	void move() {
		System.out.println("화재를 진압하며 주행합니다.");
	}

}

public class E15_오버라이딩 {

	public static void main(String[] args) {

		Car[] car = new Car[3];

		// 업캐스팅
		car[0] = new Bus();
		car[1] = new Ambulance();
		car[2] = new FireEngine();

		for (Car c : car) {
			c.move();

			if (c instanceof Ambulance) {
				Ambulance am = (Ambulance) c;
				am.special();

			}

			if (c instanceof Bus) {
				Bus bus = (Bus) c;
				c.a = bus.a;
			}

			if (c instanceof FireEngine) {
				FireEngine fe = (FireEngine) c;
				c.a = fe.a;
			}
			
			System.out.println(c.a);
		}

	}

}
