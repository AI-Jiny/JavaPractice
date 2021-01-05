package step3_constructor;

class Subcribe {

	String name;
	private String phone; // private를 붙이면 소속되어있는 클래스에서만 호출할 수있다.

	Subcribe(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	void ChangePhone(String phone) {
		this.phone = phone;
	}

	void print() {
		System.out.println("이름 : " + name + ", 전화번호 : " + phone);
	}

}

public class C4_SubcribeEx {

	public static void main(String[] args) {

		Subcribe s1 = new Subcribe("홍길동", "010-1111-1111");
		Subcribe s2 = new Subcribe("이순신", "010-2222-2222");

		s1.name = "강감찬";
		// s1.phone="010-9999-9999";

		s1.ChangePhone("010-3333-3333");
		s2.ChangePhone("010-4444-4444");

		s1.print();
		s2.print();

	}

}
