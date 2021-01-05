package step7_Extends;

class T {
	private String name;
	private int age;

	T(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void show() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

//	void setName(String n) {
//		this.name = n;
//	}
//	
//	String getName() {
//		return name;
//	}

}

class F extends T {

	String degree;

	
	F(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
		
	}

	void show() {
		super.show();
		System.out.println("Degree : " + degree);
	}
}

public class E9_상속활용 {
	public static void main(String[] args) {

		F f = new F("홍길동", 30, "박사");
		f.show();

		T t = new T("김효진", 25);
		t.show();

	}
}
