package step4_objarr;

class Circle {

	int radius;
	final double PI = 3.14;

	Circle(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return PI * radius * radius;
	}

}

public class Obj1_Circle {

	public static void main(String[] args) {
		// 1. 객체 배열 선언 후 생성
		Circle[] c = new Circle[10];

		// 2. 반복문을 이용해서 순차적으로 객체를 입력
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);// 생성자
		}

		// 3. 메소드 호출
		for (int i = 0; i < c.length; i++) {
			System.out.println("반  지  름 : "+c[i].radius);
			System.out.println("원의 넓이 : "+c[i].getArea());
			System.out.println("----------------------");
		}

	}

}
