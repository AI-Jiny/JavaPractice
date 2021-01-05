package step7_Extends;

class Obj {
	void print() {
		System.out.println("요일");
	}
	
	String a(){
		return "부모클래스";
	}
	
	
}

class Mon extends Obj {

	@Override
	void print() {
		System.out.println("월요일");
	}
}

class Tue extends Obj {
	@Override
	void print() {
		System.out.println("화요일");
	}
}

class Wed extends Obj {
	@Override
	void print() {
		System.out.println("수요일");
	}
}

public class E14_OverrideP {

	public static void main(String[] args) {

		// 각 요일을 오버라이딩을 활용하여 동적바인딩으로 실행시켜보세요.
		
		Obj obj;
		
		obj = new Mon();
		obj.print();
		
		obj = new Tue();
		obj.print();
		
		obj = new Wed();
		obj.print();
		
		
//		Mon d = (Mon)obj;
//		d.print();
		
		

	}
}
