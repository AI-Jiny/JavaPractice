/*
	. @Oerride (재정의)
	
		- 슈퍼클래스의 메소드와 완전히 동일한 메소드를 재정의 한다.
		- 메소드 오버라이딩 시에 슈퍼 클래스 메소드의 접근 지정자보다 접근의 범위가 좁아질 수 없다.
		- 메소드 오버라이딩 시에 메소드 이름, 매개변수 리스트, 리턴타입까지 모두 같아야한다.
		
		
	<<<			오버로딩			|			오버라이딩			>>>
	-----------------------------------------------------------
	. 정적 바인딩					|. 동적 바인딩	
	. 컴파일시 중복 메소드중 호출되는 메소드	|. 실행시간에 오버라이딩 된 메소드 찾아 호출
		결정						|. 수퍼클래스에 구현된 메소드를 무시하고 서브
	. 이름이 같은 여러개의 메소드를 중복정의	|	클래스에서 재정의 해서 사용
		하여 사용의 관리성 향상			|
								|
	
	
	*/
package step7_Extends;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class E13_OverRide {

	public static void main(String[] args) {

		Line line = new Line();
		line.draw();

		// 동적바인딩(오버라이팅 : 상속, 업캐스팅)
		Shape shape;
		shape = new Line(); // 업캐스팅
		shape.draw();

		shape = new Rect();
		shape.draw();

		shape = new Circle();
		shape.draw();

	}

}
