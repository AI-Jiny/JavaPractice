package step1_클래스와객체;

public class C3_Goods {

	// 필드
	String name;
	int price, numberOdStock, sold;

	// 생성자
	// 생략 : 기본생성자는 컴파일 될때 자동생성된다.

	// 메소드
	public static void main(String args[]) {

		// 객체생성
		C3_Goods camera;
		camera = new C3_Goods(); // 기본 생성자

		// 필드값 초기화
		camera.name = "SAMSUNG";
		camera.price = 400000;
		camera.numberOdStock = 30;
		camera.sold = 50;

		// 활용
		System.out.println("제품명 : " + camera.name);
		System.out.println("판매가 : " + camera.price);
		System.out.println("재고수 : " + camera.numberOdStock);
		System.out.println("판매수량 : " + camera.sold);

	}

}
