package step2_Variable;

public class V1_초기화Ex {
	
	public static void main(String[] args) {
		
		//	1. 객체생성
		V1_초기화 mCar = new V1_초기화()	;
		V1_초기화 yCar = new V1_초기화()	;
		
		mCar.color = "빨강";
		yCar.color = "검정";
		
		System.out.println("내차는...");
		mCar.speed = 200;
		mCar.speedUp();
		yCar.speedUp();
		
		mCar.print();
		yCar.print();
		
		mCar.stop();
		yCar.stop();
		
		
		
	}

}
