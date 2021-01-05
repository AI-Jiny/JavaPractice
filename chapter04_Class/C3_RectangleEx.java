package step3_constructor;

class Shape {
	Shape(int w) {
		System.out.println("정사각형의 넓이 : " + (w * w));

	}

	Shape(int w, int h) {
		System.out.println("직사각형의 넓이 : " + (w * h));

	}

	Shape(int w, int h, int d) {
		System.out.println("직육면체의 부피 : " + (w * h * d));

	}

}

public class C3_RectangleEx {

	public static void main(String[] args) {
		
		Shape r1 = new Shape(5);
		Shape r2 = new Shape(5, 10);
		Shape r3 = new Shape(5, 10, 7);
		

	}
}
