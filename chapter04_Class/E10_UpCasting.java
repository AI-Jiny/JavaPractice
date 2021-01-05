package step7_Extends;

/*
	업 캐스팅 : 
		- 서브클래스는 슈퍼클래스의 모든 특성을 상속받는다.
		- 서브클래스는 슈퍼클래스로 취급될 수 있다.
		- 서브클래스 객체가 슈퍼클래스 타입으로 변환되는 것을 의미한다.
			- 선언된 레퍼런스는 부모객체의 멤버변수만 접근 가능하다.
			- 자식 멤버변수 접근 시 컴파일 에러 발생

	다운 캐스팅 : 
		- 업캐스팅된 서브클래스 객체는 영원히 자신의 고유 특성을 잃어버리는 것이 아니다.
		- 업캐스팅된 것을 다시 원래대로 되돌리는 것을 다운캐스팅이라고 한다.
		- 다운 캐스팅은 업캐스팅과 다르게 명시적으로 타입을 지정해야 한다. 
*/
class Person {

	String name;
	String id;

	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {

	String grade;

	public Student(String name) {
		super(name);
	}

	void print() {
		System.out.println("자식 프린트 메소드");
	}
}

public class E10_UpCasting {

	public static void main(String[] args) {

		//자식 객체 생성
		Student s = new Student("홍길동");
		s.grade = "A";						//자식 멤버 변수 접근
		System.out.println(s.grade);		//
		s.print();							//자식 멤버 메소드 접근

		
		System.out.println(s.name);			//부모 멤버 변수 접근
		s.id="love";						//
		System.out.println(s.id);			//부모 멤버 변수 접근
		
		
		
		
//		Person p;
//		Student s = new Student("전혜빈");
//		p = s;	//업캐스팅 되는 순간
		
		// 업캐스팅
		Person p = new Student("전혜빈");
/*		p.grade = "B";			
		p.print();			자식의 멤버변수와 멤버메소드 호출 불가능
*/		System.out.println(p.name);
		p.id="hate";
		System.out.println(p.id);
		
		
		
		//다운캐스팅 : 명시적으로 형변환
		Student t = (Student)p;
		t.grade="C";						//자식
		t.print();							//자식
		System.out.println(t.name);			//부모
		t.id="happy";
		System.out.println(t.id);			//부모
		
		
	}

}
