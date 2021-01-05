/*
	초기화
		- 필드의 값은 자바에서는 초기화시키지 않아도 암묵적으로 초기화된다.
		- int=0, String=Null 등등
		

*/
package step2_Variable;

public class V1_초기화 {
	
	//필드
	String color;		//초기값이 없다
	int speed;
	
	//생성자
	public V1_초기화() {
	}
	
	//메소드
	void speedUp() {
		System.out.println(speed+"속도를 올렸습니다.");
	}
	
	void print() {
		System.out.println("색깔 : "+color);
		System.out.println("속도 : "+speed);
	}
	
	void stop() {
		System.out.println("주행을 멈춥니다.");
	}
	

	//실행메소드

	//main메소드
		
		
	}




