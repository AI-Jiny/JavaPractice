package step7_Extends;

class AA {
	int a = 0;
	String b = "JAVA";

	void printA() {
		System.out.println("부모 메소드 입니다.");
	}
}

class BB extends AA {
	int c = 60;
	String d = "Hello";

	void printB() {
		System.out.println("자식 메소드 입니다.");
	}
	
	//instanceOf

}

public class E11_UpDownCastingEx {

	public static void main(String[] args) {
		
		//기본생성
		BB bb=new BB();
		bb.printA();
		bb.printB();
		System.out.println(bb.a+" "+bb.b+" "+bb.c+" "+bb.d);
		
		//업캐스팅
		AA aa=new BB();
		
		
		//다운캐스팅
		BB cc = (BB)aa;
		
		

	}

}
