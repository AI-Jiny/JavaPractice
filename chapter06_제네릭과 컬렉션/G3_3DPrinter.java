package GenericMake;

//파우더 클래스
class Powder {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}

	public String toString() {
		return "재료는 Powder입니다.";
	}

}

//플라스틱 클래스
class plastic {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}

	public String toString() {
		return "재료는 Plastic입니다.";
	}

}

//파우더 사용 프린터

class ThreedPrinter1 {
	// 멤버변수 : 파우더 클래스 객체 타입의 변수 선언
	private Powder material;

	// 생성자 : 파우더 클래스를 받아서 초기화
	public void setMaterial(Powder material) {
		this.material = material;

	}

	// 메소드 :
	public Powder getMaterial() {
		return material;
	}
}

//플라스틱 사용 프린터

class ThreedPrinter2 {
	// 멤버변수 : 파우더 클래스 객체 타입의 변수 선언
	private plastic material;

	// 생성자 : 파우더 클래스를 받아서 초기화
	public void setMaterial(plastic material) {
		this.material = material;

	}

	// 메소드 :
	public plastic getMaterial() {
		return material;
	}
}

//제네릭 타입의 제네릭 프린터

class GenericPrinter <T>{
	//멤버변수 : 파우더 클래스 객체 타입의 변수 선언
	private T material;

	//생성자 : 파우더 클래스를 받아서 초기화
	public void setMaterial(T material) {
		this.material = material;

	}
	//메소드 : 
	public T getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {		//object 클래스의 toString()메소드 재정의
		return material.toString();
	}
}


public class G3_3DPrinter {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> p1 = new GenericPrinter();
		
		p1.setMaterial(new Powder());	//객체생성 바로하는 과정, Powder p = new Powder();
		
		Powder powder = p1.getMaterial();
		
		System.out.println(powder);
		System.out.println(powder.toString());		//toString은 항상 붙는다.
		
		

	}

}
